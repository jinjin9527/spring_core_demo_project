package com.sylinx.p5.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest5 {
    public static void main(String[] args) {

        // before using c and p namespace
        // xmlns:c="http://www.springframework.org/schema/c"
        // xmlns:p="http://www.springframework.org/schema/p"
        // should be added to xml declare
        ApplicationContext context = new ClassPathXmlApplicationContext("file:05-spring-di/src/main/resources/applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
        User user_p = context.getBean("user", User.class);
        System.out.println(user_p);

        User user_c = context.getBean("user2", User.class);
        System.out.println(user_c);
    }
}
