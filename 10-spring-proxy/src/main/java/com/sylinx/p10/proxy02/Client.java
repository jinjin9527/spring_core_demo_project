package com.sylinx.p10.proxy02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl() ;
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
