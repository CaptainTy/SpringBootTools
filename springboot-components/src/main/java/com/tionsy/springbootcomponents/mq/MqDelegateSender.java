package com.tionsy.springbootcomponents.mq;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.tionsy.springbootcomponents.mq.util.RabbitMqUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
 * @date Created in 2020年01月17日 10:53
 * @since 1.0
 */
@Slf4j
@Component
public class MqDelegateSender {
    @Value("${rabbitmq.sender.switch}")
    private String mqLogSwitch;
    @Resource
    private RabbitMqUtil rabbitMqUtil;

    /**
     * send 入口 exchange默认本应用exchange
     *
     * @param keyEnum keyEnum
     * @param message message
     */
    public void sendMessage(RoutingKeyEnum keyEnum, Object message) {
        if (canPrintLog()) {
            log.info("send mqMessage,routingKey:[{}],data:[{}]", keyEnum.getRoutingKeyCode(), JSON.toJSONString(message));
        }
        sendMessage(ExchangeEnum.defaultExchange.getExchangeName(), keyEnum.getRoutingKeyCode(), message);
    }

    /**
     * send 入口
     *
     * @param exchangeEnum exchangeEnum
     * @param keyEnum keyEnum
     * @param message message
     */
    public void sendMessage(ExchangeEnum exchangeEnum, RoutingKeyEnum keyEnum, Object message) {
        if (canPrintLog()) {
            log.info("send mqMessage,routingKey:[{}],data:[{}]", keyEnum.getRoutingKeyCode(), JSON.toJSONString(message));
        }

        sendMessage(exchangeEnum.getExchangeName(), keyEnum.getRoutingKeyCode(), message);
    }

    private void sendMessage(String exchangeName, String routingKey, Object message) {
        rabbitMqUtil.sendMessage(exchangeName, routingKey, message);
    }

    private boolean canPrintLog() {
        return StringUtils.equalsIgnoreCase(mqLogSwitch, SwitchModel.ON.code);
    }

    public enum SwitchModel {
        /**
         * 日志打开
         */
        ON("on", "开启日志打印"),
        /**
         * 关闭日志
         */
        OFF("off", "关闭日志打印");
        private String code;
        private String desc;

        SwitchModel(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
