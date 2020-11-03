package com.tionsy.springbootcomponents.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

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
 * @date Created in 2020年11月03日 11:32
 * @since 1.0
 */
@Slf4j
public class MyFilter implements Filter {
    /**
     * 通过配置类实现
     * 注解方法和配置类方法最好不要混用，多个过滤器时，会先执行使用配置的过滤，在执行使用注解的过滤器
     */

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        log.info("myFilter----FilterName:{}",filterConfig.getFilterName());
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("myFilter----");
        chain.doFilter(request, response);
    }
}
