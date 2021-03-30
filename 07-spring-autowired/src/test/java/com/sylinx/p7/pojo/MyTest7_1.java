package com.sylinx.p7.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest7_1 {
    public static void main(String[] args) {
        // autowire
        ApplicationContext context = new ClassPathXmlApplicationContext("file:07-spring-autowired/src/main/resources/applicationContext.xml");
        // byname
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getCat().shout();
        people.getDog().shout();

        // bytype
//        Cat cat = context.getBean("people222", Cat.class);
//        Dog dog = context.getBean("people", Dog.class);


    }
}
