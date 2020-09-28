package com.xxfw.monitor.Model;

import com.xxfw.monitor.entity.ServerHistoryEntity;
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
 * @date Created in 2020年09月19日 14:44
 * @since 1.0
 */
@Data
public class ServerHistoryVO {
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
    private List<ServerHistoryEntity> history;
}
