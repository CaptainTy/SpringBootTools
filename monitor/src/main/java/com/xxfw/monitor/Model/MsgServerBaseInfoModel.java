package com.xxfw.monitor.Model;

import lombok.Data;

import java.util.Date;

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
 * @date Created in 2020年09月17日 10:29
 * @since 1.0
 */
@Data
public class MsgServerBaseInfoModel {
    private String server_id;
    private String server_name;
    private String version;
    private int proto;
    private String go;
    private String host;
    private int port;
    private int max_connections;
    private long ping_interval;
    private int ping_max;
    private String http_host;
    private int http_port;
    private int https_port;
    private int auth_timeout;
    private int max_control_line;
    private int max_payload;
    private int max_pending;
    private Object cluster;
    private Object gateway;
    private Object leaf;
    private double tls_timeout;
    private int write_deadline;
    private String start;
    private Date now;
    private String uptime;
    private int mem;
    private int cores;
    private int cpu;
    private long connections;
    private int total_connections;
    private int routes;
    private int remotes;
    private int leafnodes;
    private long in_msgs;
    private long out_msgs;
    private long in_bytes;
    private long out_bytes;
    private long slow_consumers;
    private long subscriptions;
//    private HttpReqStatsBean http_req_stats;
    private String config_load_time;

}
