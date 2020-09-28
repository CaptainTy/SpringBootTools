//package com.xxfw.monitor.common;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BeanConfig {
//
//    //mybatis-plus 性能分析插件，控制打印sql，不注入就不打印sql
//    @ConditionalOnProperty(prefix = "sql" ,name="performanceInterceptor",havingValue = "true")
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }
//}
