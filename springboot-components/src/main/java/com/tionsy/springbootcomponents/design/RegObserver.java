package com.tionsy.springbootcomponents.design;

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
 * @date Created in 2020年08月18日 16:59
 * @since 1.0
 */
public interface RegObserver {
    void handleRegSuccess(long userId);
}
