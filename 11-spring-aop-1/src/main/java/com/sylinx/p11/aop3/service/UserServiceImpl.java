package com.sylinx.p11.aop3.service;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("aop3 add a user");
    }

    @Override
    public void delete() {
        System.out.println("aop3delete a user");
    }

    @Override
    public void update() {
        System.out.println("aop3 update a user");
    }

    @Override
    public void query() {
        System.out.println("aop3 query a user");
    }
}
