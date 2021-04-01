package com.sylinx.p11.aop3.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.sylinx.p11.aop3.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("aop3 annotation point cut before a method");
    }

    @After("execution(* com.sylinx.p11.aop3.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("aop3 annotation point cut after a method");
    }
    @Around("execution(* com.sylinx.p11.aop3.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("aop3 annotation around before a method");
        System.out.println(jp.getSignature().getName());
        Object obj = jp.proceed();
        System.out.println("aop3 annotation around after a method");
        System.out.println("aop3 annotation around result " + obj);

    }
}
