package com.tionsy.springbootcomponents;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@MapperScan(basePackages="com.tionsy.springbootcomponents.mapper")
public class SpringbootComponentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootComponentsApplication.class, args);
    }

}
