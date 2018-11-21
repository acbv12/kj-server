package com.kj.app.api;

import com.kj.common.constant.model.PermissiveCORSFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.kj")
@MapperScan("com.kj.mapper")
@EnableScheduling
public class KjAppApiApplication {

//    @Bean
//    public FilterRegistrationBean permissiveCORSFilterRegistrationBean(){
//
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        PermissiveCORSFilter permissiveCORSFilter = new PermissiveCORSFilter();
//        registration.setFilter(permissiveCORSFilter);
//        registration.setName("permissiveCORSFilter");
//        registration.setOrder(0);
//
//        return registration;
//    }

    public static void main(String[] args) {
        SpringApplication.run(KjAppApiApplication.class, args);
    }
}
