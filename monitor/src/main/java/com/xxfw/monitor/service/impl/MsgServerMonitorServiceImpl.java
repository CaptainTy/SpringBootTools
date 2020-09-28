package com.xxfw.monitor.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xxfw.monitor.Model.*;
import com.xxfw.monitor.entity.ConnectionHistoryEntity;
import com.xxfw.monitor.entity.ServerHistoryEntity;
import com.xxfw.monitor.repository.ConnectionHistoryEntityMapper;
import com.xxfw.monitor.repository.ServerHistoryEntityMapper;
import com.xxfw.monitor.service.MsgServerMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tianyun
 * @version 1.0
 * @date Created in 2020年09月17日 10:54
 * @since 1.0
 */
@Service
public class MsgServerMonitorServiceImpl implements MsgServerMonitorService {

    @Value("${varz_url}")
    private String varzUrl;

    @Value("${connz_url}")
    private String connzUrl;

    @Autowired
    ConnectionHistoryEntityMapper connectionHistoryEntityMapper;

    @Autowired
    ServerHistoryEntityMapper serverHistoryEntityMapper;

    @Override
    public String getServerBaseInfo() {
        MsgServerBaseInfoModel connectionsModel = this.getMsgServerBaseInfoModel();
        return JSON.toJSONString(connectionsModel, SerializerFeature.WriteMapNullValue);
    }

    @Override
    public String getConnectionsInfo() {
        ConnectionsModel connectionsModel = getConnectionsModel();
        return JSON.toJSONString(connectionsModel, SerializerFeature.WriteMapNullValue);
    }

    private ConnectionsModel getConnectionsModel() {
        ConnectionsModel connectionsModel = null;
        try {
            RestTemplate template = new RestTemplate();
            URI uri = new URI(connzUrl);
            connectionsModel = template.getForObject(uri, ConnectionsModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectionsModel;
    }

    @Override
    public String getServerHistoryInfo(String startTime) {
        MsgServerBaseInfoModel msgMadel = this.getMsgServerBaseInfoModel();
        Date date = null;
        if (startTime==null){
            date = Date.from(LocalDateTime.now().minusHours(1).atZone(ZoneId.systemDefault()).toInstant());
        }else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                date = format.parse(startTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<ServerHistoryEntity> result = serverHistoryEntityMapper.getServerHistoryInfo(date);

        ServerHistoryVO model = new ServerHistoryVO();
        model.setConnections(msgMadel.getConnections());
        model.setIn_bytes(msgMadel.getIn_bytes());
        model.setIn_msgs(msgMadel.getIn_msgs());
        model.setOut_bytes(msgMadel.getOut_bytes());
        model.setOut_msgs(msgMadel.getOut_msgs());
        model.setNow(msgMadel.getNow());
        model.setSlow_consumers(msgMadel.getSlow_consumers());
        model.setSubscriptions(msgMadel.getSubscriptions());
        if (result != null){
            ServerHistoryEntity lastEntity = result.get(0);
            model.setIn_msgs_speed(msgMadel.getIn_msgs()-lastEntity.getIn_msgs());
            model.setOut_msgs(msgMadel.getOut_msgs()-lastEntity.getOut_msgs());
            model.setIn_bytes_speed(msgMadel.getIn_bytes()-lastEntity.getIn_bytes());
            model.setOut_bytes_speed(msgMadel.getOut_bytes()-lastEntity.getOut_bytes());
        }
        model.setHistory(result);

        return JSON.toJSONString(model, SerializerFeature.WriteMapNullValue);
    }

    @Override
    public String getClientHistoryInfo(Long cid, String startTime) {
        ConnectionsModel connModel = getConnectionsModel();

        //实时查询取出最新的一条
        ConnectionDetailModel conn = null;
        if (connModel != null){
            List<ConnectionDetailModel> connections = connModel.getConnections();
            conn = connections.stream().filter(c -> c.getCid() == cid).findFirst().orElse(null);
        }
        ConnectionsHistoryInfoVO model = new ConnectionsHistoryInfoVO();
        if (conn != null){
            model.setPort(conn.getPort());
            model.setVersion(conn.getVersion());
            model.setUptime(conn.getUptime());
            model.setStart(conn.getStart());
            model.setRtt(conn.getRtt());
            model.setCid(cid);
            model.setLast_activity(conn.getLast_activity());
            model.setLang(conn.getLang());
            model.setName(conn.getName());
            model.setIdle(conn.getIdle());
            model.setPending_bytes(conn.getPending_bytes());
            model.setIp(conn.getIp());
            model.setSubscriptions(conn.getSubscriptions());
            model.setIn_bytes(conn.getIn_bytes());
            model.setOut_bytes(conn.getOut_bytes());
            model.setIn_msgs(conn.getIn_msgs());
            model.setOut_msgs(conn.getOut_msgs());
        }

        Date date = null;
        if (startTime==null){
            date = Date.from(LocalDateTime.now().minusHours(1).atZone(ZoneId.systemDefault()).toInstant());
        }else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                date = format.parse(startTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<ConnectionHistoryEntity> connectionHistory = connectionHistoryEntityMapper.getConnectionHistory(cid, date);
        ConnectionHistoryEntity lastEntity = connectionHistory.get(0);
        if (lastEntity != null && conn != null){
            model.setIn_bytes_speed(conn.getIn_bytes()-lastEntity.getIn_bytes());
            model.setOut_bytes_speed(conn.getOut_bytes() - lastEntity.getOut_bytes());
            model.setIn_msgs_speed(conn.getIn_msgs()-lastEntity.getIn_msgs());
            model.setOut_msgs_speed(conn.getOut_msgs()-lastEntity.getOut_msgs());
        }
        model.setHistory(connectionHistory);
        return JSONObject.toJSONString(model, SerializerFeature.WriteMapNullValue);
    }

    @Override
    public void ObtainSnapshotInfo() {
       this.obtainServerInfo();

       this.obtainConnectionInfo();
    }

    private void obtainServerInfo(){
        try {
            RestTemplate template = new RestTemplate();
            URI uri = new URI(varzUrl);
            MsgServerBaseInfoModel connectionsModel = template.getForObject(uri,  MsgServerBaseInfoModel.class);
            if (connectionsModel == null){
                return;
            }
            ServerHistoryEntity entity = new ServerHistoryEntity();
            entity.setTime(connectionsModel.getNow());
            entity.setIn_bytes(connectionsModel.getIn_bytes());
            entity.setOut_bytes(connectionsModel.getOut_bytes());
            entity.setIn_msgs(connectionsModel.getIn_msgs());
            entity.setOut_msgs(connectionsModel.getOut_msgs());
            entity.setConnections(connectionsModel.getConnections());
            entity.setSlow_consumers(connectionsModel.getSlow_consumers());
            entity.setSubscriptions(connectionsModel.getSubscriptions());

            ServerHistoryEntity prevServer = serverHistoryEntityMapper.getPrevServerHistory();
            if (prevServer != null) {
                entity.setIn_bytes_speed(connectionsModel.getIn_bytes()-prevServer.getIn_bytes());
                entity.setOut_bytes(connectionsModel.getOut_bytes()-prevServer.getOut_bytes());
                entity.setIn_msgs_speed(connectionsModel.getIn_msgs()-prevServer.getIn_msgs());
                entity.setOut_msgs_speed(connectionsModel.getOut_msgs()-prevServer.getOut_msgs());
            }

            serverHistoryEntityMapper.insertSelective(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void obtainConnectionInfo(){
        try {
            RestTemplate template = new RestTemplate();
            URI uri = new URI(connzUrl);
            ConnectionsModel connectionsModel = template.getForObject(uri, ConnectionsModel.class);
            if (connectionsModel == null){
                return;
            }
            List<ConnectionDetailModel> connections = connectionsModel.getConnections();
            connections.forEach(connection->{
                ConnectionHistoryEntity entity = new ConnectionHistoryEntity();
                entity.setCid(connection.getCid());
                entity.setTime(connectionsModel.getNow());
                entity.setIn_bytes(connection.getIn_bytes());
                entity.setOut_bytes(connection.getOut_bytes());
                entity.setIn_msgs(connection.getIn_msgs());
                entity.setOut_msgs(connection.getOut_msgs());
                entity.setSubscriptions(connection.getSubscriptions());

                ConnectionHistoryEntity prevConnection = connectionHistoryEntityMapper.getPrevConnectionHistory(connection.getCid());
                if (prevConnection != null){
                    entity.setIn_bytes_speed(connection.getIn_bytes()-prevConnection.getIn_bytes());
                    entity.setOut_bytes(connection.getOut_bytes()-prevConnection.getOut_bytes());
                    entity.setIn_msgs_speed(connection.getIn_msgs()-prevConnection.getIn_msgs());
                    entity.setOut_msgs_speed(connection.getOut_msgs()-prevConnection.getOut_msgs());
                }

                connectionHistoryEntityMapper.insertSelective(entity);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MsgServerBaseInfoModel getMsgServerBaseInfoModel() {
        MsgServerBaseInfoModel connectionsModel = null;
        try {
            RestTemplate template = new RestTemplate();
            URI uri = new URI(varzUrl);
            connectionsModel = template.getForObject(uri,  MsgServerBaseInfoModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connectionsModel;
    }
}
