package com.sylinx.p09.config;

import com.sylinx.p09.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// same to beans.xml
@Configuration
public class AppConfig1 {

    // same to <bean id="getUser1" class="User"/>
    @Bean
    public User getUser1(){
        return new User();
    }
}
