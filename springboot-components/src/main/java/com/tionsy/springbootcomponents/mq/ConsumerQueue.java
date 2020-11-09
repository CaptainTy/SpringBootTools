package com.tionsy.springbootcomponents.mq;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author yangxb
 * @version 1.0
 * @date Created in 2020年01月17日 13:20
 * @since 1.0
 */
public interface ConsumerQueue {

    String DEMO_QUEUE = "crm.q.trade.service.consumer.demo";

    String LIVE_EXPENSE_AUDIT_PASS_QUEUE = "crm.q.live.expense.audit.pass.queue";

    String CONTRACT_EXPIRE_QUEUE = "crm.q.contract.expire.queue";

    //管家变更通知
    String EX_COSMOS_EMP_SYNC_QUEUE = "crm.q.hire.cosmos.emp.notify.queue";

}
