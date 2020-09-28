package com.tiany.keys.spi;


import org.junit.Test;

import java.util.ServiceLoader;

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
 * @date Created in 2019年11月23日 14:22
 * @since 1.0
 */
public class HelloServiceTest {

    @Test
    public void spiTest(){
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : loaders) {
            helloService.sayHello();
        }
    }
}
