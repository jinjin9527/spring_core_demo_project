package com.sylinx.p11.aop1.service;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("aop1 add a user");
    }

    @Override
    public void delete() {
        System.out.println("aop1 delete a user");
    }

    @Override
    public void update() {
        System.out.println("aop1 update a user");
    }

    @Override
    public void query() {
        System.out.println("aop1 query a user");
    }
}
