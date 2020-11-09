package com.tionsy.springbootcomponents.mq.util;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
 * @author yangxb
 * @version 1.0
 * @date Created in 2020年01月17日 10:46
 * @since 1.0
 */
@Component
public class RabbitMqUtil {
    private AmqpTemplate rabbitTemplate;

    public void sendMessageWithDefaultExchange(String routingKey, Object message) {
        rabbitTemplate.convertAndSend(routingKey, message);
    }

    public void sendMessageWithDefaultExchangeAndDefaultRk(Object message) {
        rabbitTemplate.convertAndSend(message);
    }

    public void sendMessage(String exchange, String routingKey, Object message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }

    @Autowired
    public void setRabbitTemplate(@Qualifier("rabbitTemplate") AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

}
