package com.sylinx.p10.proxy03;

import com.sylinx.p10.proxy02.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        signContract();
        Object result = method.invoke(this.rent, args);
        takeFare();
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
            rent.getClass().getInterfaces(), this);
    }

    public void seeHouse(){
        System.out.println("see a house");
    }

    public void takeFare(){
        System.out.println("take money");
    }

    public void signContract(){
        System.out.println("sign Contract");
    }
}
