package com.tionsy.springbootcomponents.service.impl;

import com.tionsy.springbootcomponents.SpringbootComponentsApplication;
import com.tionsy.springbootcomponents.service.TestService;
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
 * @date Created in 2020年10月29日 23:03
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringbootComponentsApplication.class)
class TestServiceImplTest {

    @Autowired
    TestService testService;

    @Test
    public void testFile(){
        String listener = testService.listener();
        System.out.println();
    }

    @org.junit.jupiter.api.Test
    public void test1(){
        String listener = testService.listener();
        System.out.println();
    }
}