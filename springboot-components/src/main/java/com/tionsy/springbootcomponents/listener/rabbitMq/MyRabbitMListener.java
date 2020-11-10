package com.tionsy.springbootcomponents.listener.rabbitMq;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.AMQP;
import com.tionsy.springbootcomponents.mq.ConsumerQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

    @RabbitListener(containerFactory = "myListenerFactory",
            queues = {ConsumerQueue.DEMO_QUEUE})
    public void consume(Message message) throws IOException {
        String data = new String(message.getBody(), StandardCharsets.UTF_8);
        log.info("接收处理队列A当中的消息:{}", data);
    }
}
