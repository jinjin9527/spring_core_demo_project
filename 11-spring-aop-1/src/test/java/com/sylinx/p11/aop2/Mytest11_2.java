package com.sylinx.p11.aop2;

import com.sylinx.p11.aop2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest11_2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:11-spring-aop-1/src/main/resources/applicationContext.xml");
        UserService userService = context.getBean("userService_aop2", UserService.class);
        userService.add();
    }
}
