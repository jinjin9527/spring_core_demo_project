package com.sylinx.p11.aop2.service;

public class DiyPointCut {
    public void before(){
        System.out.println("aop2 before a method");
    }
    public void after(){
        System.out.println("aop2 after a method");
    }
}

