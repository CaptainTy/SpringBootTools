package com.xxfw.monitor.controller;

import com.xxfw.monitor.service.MsgServerMonitorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
 * @date Created in 2020年09月17日 10:40
 * @since 1.0
 */
@Api(value = "监控接口", tags = {"监控接口"})
@RestController()
@RequestMapping("/monitor")
public class MsgServerMonitorController {

    @Autowired
    MsgServerMonitorService msgServerMonitorService;

    @PostMapping(value = "/getServerBaseInfo")
    @ApiOperation(value = "获取服务基础信息", produces = "application/json")
    public String getServerBaseInfo(){

        return msgServerMonitorService.getServerBaseInfo();
    }

    @PostMapping(value = "/getConnectionsInfo")
    @ApiOperation(value = "获取连接信息", produces = "application/json")
    public String getConnectionsInfo(){

        return msgServerMonitorService.getConnectionsInfo();
    }

    @PostMapping(value = "/getServerHistoryInfo")
    @ApiOperation(value = "获取连接历史信息", produces = "application/json")
    public String getServerHistoryInfo(@RequestParam(required=false) @ApiParam(name = "time", value = "开始时间") String startTime){

        return msgServerMonitorService.getServerHistoryInfo(startTime);
    }

    @PostMapping(value = "/getClientHistoryInfo")
    @ApiOperation(value = "获取客户端历史信息", produces = "application/json")
    public String getClientHistoryInfo(@RequestParam @ApiParam(name = "cid", value = "cid") Long cid,
                                       @RequestParam(required=false) @ApiParam(name = "time", value = "开始时间") String startTime){

        return msgServerMonitorService.getClientHistoryInfo(cid,startTime);
    }
}
