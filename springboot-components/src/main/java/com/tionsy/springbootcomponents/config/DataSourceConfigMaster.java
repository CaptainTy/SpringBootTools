//package com.tionsy.springbootcomponents.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
///**
// * <p></p>
// * <p>
// * <PRE>
// * <BR>    修改记录
// * <BR>-----------------------------------------------
// * <BR>    修改日期         修改人          修改内容
// * </PRE>
// *
// * @author tianyun
// * @version 1.0
// * @date Created in 2020年07月12日 20:57
// * @since 1.0
// */
//@Configuration
//public class DataSourceConfigMaster {
//
//    @Resource
//    @Lazy
//    private DataSource dataSource;
//
//    @Bean
//    public MySQLMaxValueIncrementer mySQLMaxValueIncrementer() {
//        return new MySQLMaxValueIncrementer(dataSource, "code_sequence", "hireContractCodeSeq");
//    }
//}
