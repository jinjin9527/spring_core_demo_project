package com.sylinx.p10.proxy03;

import com.sylinx.p10.proxy02.UserService;
import com.sylinx.p10.proxy02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        Host host = new Host() ;
        ProxyInvocationHandler myHandler = new ProxyInvocationHandler();
        myHandler.setRent(host);
        Rent proxyTarget = (Rent)myHandler.getProxy();
        proxyTarget.rent();

    }
}
