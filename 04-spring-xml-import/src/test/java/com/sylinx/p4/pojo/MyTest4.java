package com.sylinx.p4.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest4 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:04-spring-xml-import/src/main/resources/applicationContext.xml");
        User2 u444 = (User2)context.getBean("u444");
        System.out.println(u444.toString());

        User2 u1444 = (User2)context.getBean("u44");
        System.out.println(u1444.toString());

    }
}
