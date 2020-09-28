package com.xxfw.monitor.Model;

import com.xxfw.monitor.entity.ConnectionHistoryEntity;
import lombok.Data;

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
 * @date Created in 2020年09月17日 10:33
 * @since 1.0
 */
@Data
public class ConnectionsHistoryInfoVO {

    private Long cid;
    private int port;
    private Date start;
    private Date last_activity;
    private String rtt;
    private String ip;
    private String uptime;
    private String idle;
    private Long pending_bytes;
    private String name;
    private String lang;
    private String version;
    private Date now;
    private Long in_msgs;
    private Long out_msgs;
    private Long in_bytes;
    private Long out_bytes;
    private Long in_msgs_speed;
    private Long out_msgs_speed;
    private Long in_bytes_speed;
    private Long out_bytes_speed;
    private Long connections;
    private Long slow_consumers;
    private Long subscriptions;
    private List<ConnectionHistoryEntity> history;
}
