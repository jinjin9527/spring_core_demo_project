package com.sylinx.p7.pojo;

import com.sylinx.p7.pojo.autowiretest.PeopleAuto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest7_2 {
    public static void main(String[] args) {
        // autowire
        ApplicationContext context = new ClassPathXmlApplicationContext("file:07-spring-autowired/src/main/resources/applicationContext.xml");
        PeopleAuto peopleAuto = context.getBean("peopleAuto", PeopleAuto.class);

        peopleAuto.getCatAuto().shout();
        peopleAuto.getDogAuto().shout();
    }
}
