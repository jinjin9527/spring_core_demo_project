package com.sylinx.p14.mapper;

import com.sylinx.p14.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public void transaction1(){
        // selectUser
        List<User> userListBefore = selectUser();
        userListBefore.forEach(System.out::println);

        System.out.println("before transaction");
        // addUser
        int newId = userListBefore.get(userListBefore.size() -1).getId() + 1;
        addUser(new User(newId, "n" + newId, "p" + newId));

        // delUser
        delUser(userListBefore.get(0).getId());
        System.out.println("after transaction");

        List<User> userListAfter = selectUser();
        userListAfter.forEach(System.out::println);
    }

    @Override
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int delUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).delUser(id);
    }
}
