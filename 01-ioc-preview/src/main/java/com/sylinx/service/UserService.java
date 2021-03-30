package com.sylinx.service;

import com.sylinx.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
