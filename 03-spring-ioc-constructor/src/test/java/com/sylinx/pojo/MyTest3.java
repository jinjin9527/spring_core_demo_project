package com.sylinx.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest3 {
    public static void main(String[] args) {
////        UserService userService = new UserServiceImpl();
//        UserService userService = new UserServiceImpl();
////        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("file:03-spring-ioc-constructor/src/main/resources/beans.xml");
        User user1 = (User)context.getBean("user1");
        System.out.println(user1.toString());

        User user2 = (User)context.getBean("user2");
        System.out.println(user2.toString());

        User user3 = (User)context.getBean("user3");
        System.out.println(user3.toString());
    }
}
