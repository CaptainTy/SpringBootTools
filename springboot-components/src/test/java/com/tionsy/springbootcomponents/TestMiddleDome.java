package com.tionsy.springbootcomponents;

import com.alibaba.fastjson.JSON;
import com.tionsy.springbootcomponents.mq.MqDelegateSender;
import com.tionsy.springbootcomponents.mq.RoutingKeyEnum;
import com.tionsy.springbootcomponents.util.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
 * @date Created in 2020年11月07日 09:14
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringbootComponentsApplication.class)
public class TestMiddleDome {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private MqDelegateSender mqSender;

    @Test
    public void testRedis(){
        redisUtils.set("name","1234");

        String name = redisUtils.getKey("name");
        String val = redisUtils.getVal("name");

        redisUtils.del(name);
        System.out.println();
    }

    @Test
    public void testMq(){
        String name = "张三";
        mqSender.sendMessage(RoutingKeyEnum.DEMO, name);
        System.out.println("发送mq完毕");
    }
}
