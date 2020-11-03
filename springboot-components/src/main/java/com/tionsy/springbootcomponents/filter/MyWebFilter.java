package com.tionsy.springbootcomponents.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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
 * @date Created in 2020年11月03日 11:40
 * @since 1.0
 */
@Order(1)
@Slf4j
@WebFilter(urlPatterns = "/testDome/*",filterName = "myWebFilter")
public class MyWebFilter implements Filter {
    /**
     * 通过 @WebFilter + @ServletComponentScan 实现
     * 注解方法和配置类方法最好不要混用，多个过滤器时，会先执行使用配置的过滤，在执行使用注解的过滤器
     */

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyWebFilter----FilterName:{}",filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("MyWebFilter ---- ");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
