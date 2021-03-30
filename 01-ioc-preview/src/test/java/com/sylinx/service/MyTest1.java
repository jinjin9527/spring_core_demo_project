package com.sylinx.service;

import com.sylinx.dao.UserDaoImpl;
import com.sylinx.dao.UserDaoMysqlImpl;
import com.sylinx.dao.UserDaoOracleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest1 {
    public static void main(String[] args) {
////        UserService userService = new UserServiceImpl();
//        UserService userService = new UserServiceImpl();
////        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.setUserDao(new UserDaoOracleImpl());
//
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("file:01-ioc-preview/src/main/resources/beans.xml");
        UserService hello = (UserService)context.getBean("userServiceImpl");
        hello.getUser();
    }
}
