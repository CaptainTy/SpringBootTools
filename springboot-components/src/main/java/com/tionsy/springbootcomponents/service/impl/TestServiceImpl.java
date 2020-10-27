package com.tionsy.springbootcomponents.service.impl;

import com.tionsy.springbootcomponents.listener.MyEventTest;
import com.tionsy.springbootcomponents.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

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
 * @date Created in 2020年10月27日 17:12
 * @since 1.0
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public String listener() {
        MyEventTest eventTest = new MyEventTest("测试自定监听事件");
        applicationEventPublisher.publishEvent(eventTest);
        return "success";
    }
}
