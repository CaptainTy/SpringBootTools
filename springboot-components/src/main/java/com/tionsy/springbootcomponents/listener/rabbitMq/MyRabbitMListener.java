package com.tionsy.springbootcomponents.listener.rabbitMq;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.AMQP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

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
 * @date Created in 2020年11月09日 11:53
 * @since 1.0
 */
@Slf4j
@Component
public class MyRabbitMListener {

    @RabbitListener(containerFactory = "newClusterListenerFactoryForRentBack",
            queues = "crm.q.contract.pdf")
    public void consume(Message message, AMQP.Channel channel,
                        @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws IOException {
        log.info("接收处理队列A当中的消息:"+ JSON.toJSONString(message));
    }
}
