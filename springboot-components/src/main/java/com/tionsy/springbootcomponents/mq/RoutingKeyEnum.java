package com.tionsy.springbootcomponents.mq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

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
 * @date Created in 2020年01月17日 10:58
 * @since 1.0
 */
@Getter
@AllArgsConstructor
@ToString
public enum RoutingKeyEnum {
    DEMO("test.demo", "示例")
    ;
    /**
     * rk string
     */
    private String routingKeyCode;
    /**
     * 描述
     */
    private String desc;
}
