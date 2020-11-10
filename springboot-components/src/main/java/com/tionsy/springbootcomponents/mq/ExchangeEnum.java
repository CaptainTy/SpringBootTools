package com.tionsy.springbootcomponents.mq;


import org.springframework.amqp.core.ExchangeTypes;

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
 * @date Created in 2020年01月17日 11:02
 * @since 1.0
 */
public enum ExchangeEnum {
    /**
     * demo
     */
    DEMO("demo", ExchangeTypes.DIRECT, true, false);
    public static ExchangeEnum defaultExchange = DEMO;
    private static final String EXCHANGE = "Exchange";
    private static final String EXCHANGE_PREFIX = "test.e.";

    /**
     * 自定义名字, 但是不是最后的exchange名字, 真正的名字需要加前缀
     */
    private String value;
    /**
     * 类型
     */
    private String exchangeType;
    /**
     * 持久化, true持久
     */
    private boolean durable;
    /**
     *
     */
    private boolean autoDelete;

    ExchangeEnum(String value, String exchangeType, boolean durable, boolean autoDelete) {

        this.value = value;
        this.exchangeType = exchangeType;
        this.durable = durable;
        this.autoDelete = autoDelete;
    }

    /**
     * exchange的真正名字, 前缀 + 定义的名称
     *
     * @return
     */
    public String getExchangeName() {

        return EXCHANGE_PREFIX + value;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public boolean isDurable() {
        return durable;
    }

    public boolean isAutoDelete() {
        return autoDelete;
    }

    /**
     * <pre>
     * desc : bean名称
     * A_B_C, 生成的bean名称为aBCExchange.
     * @author : taiyn
     * date : 2019-12-10 14:29
     * @param : []
     * @return java.lang.String
     * </pre>
     */
    public String getBeanName() {

        String originalName = name();
        // 转小写
        originalName = originalName.toLowerCase();
        String[] array = originalName.split("_");
        if (array.length < 2)
            return originalName + EXCHANGE;

        StringBuilder beanName = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; i++) {

            beanName.append(array[i].substring(0, 1).toUpperCase()).append(array[i].substring(1));
        }

        return beanName.toString() + EXCHANGE;
    }


    @Override
    public String toString() {
        return "ExchangeEnums{" +
                "value='" + value + '\'' +
                ", exchangeType='" + exchangeType + '\'' +
                ", durable=" + durable +
                ", autoDelete=" + autoDelete +
                '}';
    }
}
