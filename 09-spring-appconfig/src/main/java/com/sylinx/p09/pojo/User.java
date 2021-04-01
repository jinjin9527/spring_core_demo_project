package com.sylinx.p09.pojo;

import org.springframework.beans.factory.annotation.Value;

// <bean id="user" class="com.sylinx.p8.pojo.User" />
public class User {

    @Value("n09")
    private String name;

    @Value("09")
    private int age;

    private Address address;

    public User(){
        age=0;
    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
