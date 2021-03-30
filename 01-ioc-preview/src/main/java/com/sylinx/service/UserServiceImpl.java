package com.sylinx.service;

import com.sylinx.dao.UserDao;
import com.sylinx.dao.UserDaoImpl;
import com.sylinx.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    //    private UserDao userDao = new UserDaoMysqlImpl();
    //    private UserDao userDao = new UserDaoOracleImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
