package com.sylinx.p6.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest6 {
    public static void main(String[] args) {

        // scope default singleton
        ApplicationContext context = new ClassPathXmlApplicationContext("file:06-spring-bean-scope/src/main/resources/applicationContext.xml");

        User user1 = context.getBean("user_singleton", User.class);
        User user2 = context.getBean("user_singleton", User.class);
        System.out.println(user1 == user2);

        // prototype
        User user3 = context.getBean("user_prototype", User.class);
        User user4 = context.getBean("user_prototype", User.class);

        System.out.println(user3 == user4);

        // scope : request session application
    }
}
