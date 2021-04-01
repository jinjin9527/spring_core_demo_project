package com.sylinx.p8;

import com.sylinx.p8.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest8_1 {
    public static void main(String[] args) {
        // autowire
        ApplicationContext context = new ClassPathXmlApplicationContext("file:08-spring-annotation/src/main/resources/applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
