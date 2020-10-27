package com.tionsy.springbootcomponents.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
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
 * @author tiany
 * @version 1.0
 * @date Created in 2020年10月27日 17:29
 * @since 1.0
 */
@Slf4j
@Component
public class MyEventListener {
    @EventListener
    public void handleMailSendEvent(MyEventTest event) {
        log.info("内容为:{}",  event.getSource());
    }
}
