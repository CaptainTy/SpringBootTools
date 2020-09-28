package com.xxfw.monitor.service;

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
public interface MsgServerMonitorService {

    String getServerBaseInfo();

    String getConnectionsInfo();

    String getServerHistoryInfo(String startTime);

    String getClientHistoryInfo(Long cid,String startTime);

    void ObtainSnapshotInfo();
}
