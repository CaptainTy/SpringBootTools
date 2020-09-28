package com.xxfw.monitor.Model;

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
 * @date Created in 2020年09月17日 10:36
 * @since 1.0
 */
@Data
public class ConnectionsModel {

    private String server_id;
    private Date now;
    private long num_connections;
    private long total;
    private long offset;
    private long limit;
    private List<ConnectionDetailModel> connections;
}
