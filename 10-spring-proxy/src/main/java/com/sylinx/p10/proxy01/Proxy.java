package com.sylinx.p10.proxy01;

public class Proxy implements Rent{
    private Host host;
    public Proxy(Host host){
        this.host = host;
    }
    public Proxy(){

    }
    public void rent(){
        System.out.println("proxy flow");
        seeHouse();
        signContract();
        takeFare();
        host.rent();

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
