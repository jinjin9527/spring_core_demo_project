package com.sylinx.p09.config;

import com.sylinx.p09.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// same to beans.xml
@Configuration
@ComponentScan("com.sylinx.p09")
@Import(AppConfig1.class)
public class AppConfig {

    // same to <bean id="getUser" class="User"/>
    @Bean
    public User getUser(){
        return new User();
    }
}
