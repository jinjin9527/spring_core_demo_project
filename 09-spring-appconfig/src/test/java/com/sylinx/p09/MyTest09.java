package com.sylinx.p09;

import com.sylinx.p09.config.AppConfig;
import com.sylinx.p09.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest09 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
