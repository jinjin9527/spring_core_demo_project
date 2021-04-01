package com.sylinx.p10.proxy02;

public class UserServiceProxy implements UserService{

    private UserService userService = new UserServiceImpl() ;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        this.userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        this.userService.delete();
    }

    @Override
    public void update() {
        log("update");
        this.userService.update();
    }

    @Override
    public void query() {
        log("query");
        this.userService.query();
    }

    public void log(String msg) {
        System.out.println("used " + msg + " method");
    }
}
