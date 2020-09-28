package com.tiany.keys.spi.spiImpl;

import com.tiany.keys.spi.HelloService;

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
 * @date Created in 2019年11月23日 14:18
 * @since 1.0
 */
public class HelloServiceImpl2 implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
