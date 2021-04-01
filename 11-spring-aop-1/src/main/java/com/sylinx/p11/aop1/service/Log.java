package com.sylinx.p11.aop1.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("aop1 " + target.getClass().getName() + " : " + method.getName() + " is called!");
    }
}
