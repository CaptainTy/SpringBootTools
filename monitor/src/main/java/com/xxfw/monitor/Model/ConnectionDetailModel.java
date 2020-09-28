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
 * @date Created in 2020年09月17日 10:51
 * @since 1.0
 */
@Data
public class ConnectionDetailModel {
    private long cid;
    private String ip;
    private int port;
    private Date start;
    private Date last_activity;
    private String rtt;
    private String uptime;
    private String idle;
    private long pending_bytes;
    private long in_msgs;
    private long out_msgs;
    private long in_bytes;
    private long out_bytes;
    private long subscriptions;
    private String name;
    private String lang;
    private String version;
}
