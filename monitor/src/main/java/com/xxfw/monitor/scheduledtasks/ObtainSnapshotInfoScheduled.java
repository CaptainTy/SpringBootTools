package com.xxfw.monitor.scheduledtasks;

import com.xxfw.monitor.service.MsgServerMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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
 * @date Created in 2020年09月18日 08:53
 * @since 1.0
 */
@Component
@Configuration
@EnableScheduling
public class ObtainSnapshotInfoScheduled {

    @Autowired
    MsgServerMonitorService msgServerMonitorService;

    /**
     * 快照数据落库
     * 从0分开始，每10分钟执行一次
     */
    @Scheduled(cron = "0/10 * * * * ? ")
    private void ObtainSnapshotInfo() {
        msgServerMonitorService.ObtainSnapshotInfo();
    }
}
