package com.tionsy.springbootcomponents.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 * @date Created in 2020年11月03日 11:35
 * @since 1.0
 */
@Configuration
public class WebFilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> registrationBean1(){
        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter());//注册自定义过滤器
        bean.setName("MyFilter1");//过滤器名称
        bean.addUrlPatterns("/testDome/*");//过滤所有路径
        bean.setOrder(10);//优先级，越小越先执行
        return bean;
    }

   /* @Bean
    public FilterRegistrationBean<MyWebFilter> registrationBean2(){
        FilterRegistrationBean<MyWebFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyWebFilter());//注册自定义过滤器
        bean.setName("MyFilter2");//过滤器名称
        bean.addUrlPatterns("/testBoot/*");//过滤所有路径
        bean.setOrder(2);//优先级，最顶级
        return bean;
    }*/
}
