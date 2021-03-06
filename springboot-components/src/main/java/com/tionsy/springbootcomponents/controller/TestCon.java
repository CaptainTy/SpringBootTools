package com.tionsy.springbootcomponents.controller;

import com.tionsy.springbootcomponents.interceptor.MyMethod;
import com.tionsy.springbootcomponents.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @date Created in 2020年10月27日 17:10
 * @since 1.0
 */
@RestController
@RequestMapping("/testDome")
public class TestCon {

    @Autowired
    private TestService testService;

    @GetMapping("testListener")
    public String testListener() {
        return testService.listener();

    }

    @MyMethod
    @GetMapping("interceptor")
    public String testInterceptor() {
        return testService.testInterceptor();

    }

    @GetMapping("filter")
    public String testFilter() {
        return testService.testFilter();

    }
}
