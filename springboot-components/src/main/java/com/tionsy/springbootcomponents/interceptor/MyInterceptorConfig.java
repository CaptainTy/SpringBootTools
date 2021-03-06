package com.tionsy.springbootcomponents.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
 * @date Created in 2020年11月03日 10:07
 * @since 1.0
 */
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    MyInterceptor myInterceptor;

    /**
     * addInterceptor() 注册拦截器
     * addPathPatterns()  拦截路径
     * excludePathPatterns() (不拦截的路径)
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 如果有多个拦截器
        //1.加入的顺序就是拦截器执行的顺序，
        //2.按顺序执行所有拦截器的preHandle
        //3.所有的preHandle 执行完再执行全部postHandle 最后是postHandle

        //注册拦截器
        registry
                //注册拦截器
                .addInterceptor(myInterceptor)
                //要拦截的请求路径
                .addPathPatterns("/**/interceptor");

    }
}
