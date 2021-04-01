package com.sylinx.p10.proxy04;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl() ;
        ProxyInvocationHandler myHandler = new ProxyInvocationHandler();
        myHandler.setTarget(userServiceImpl);
        UserService proxyTarget = (UserService)myHandler.getProxy();
        proxyTarget.add();
        proxyTarget.delete();

    }
}
