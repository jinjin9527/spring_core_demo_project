package com.sylinx.p11.aop2.service;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("aop2 add a user");
    }

    @Override
    public void delete() {
        System.out.println("aop2 delete a user");
    }

    @Override
    public void update() {
        System.out.println("aop2 update a user");
    }

    @Override
    public void query() {
        System.out.println("aop2 query a user");
    }
}
