package com.sylinx.p14.mapper;

import com.sylinx.p14.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int delUser(int id);

    public void transaction1();
}
