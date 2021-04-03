package com.sylinx.p13;

import com.sylinx.p13.mapper.UserMapper;
import com.sylinx.p13.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest13 {
    public static void main(String[] args) throws Exception {

        // 方法1
        ApplicationContext context = new ClassPathXmlApplicationContext("file:13-spring-mybatis2/src/main/resources/applicationContext.xml");
        SqlSession sqlSession = context.getBean("sqlSession", SqlSession.class);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println("method1");
        mapper.selectUser().forEach(System.out::println);

        // 方法2
        System.out.println("method2");
        UserMapper userMapper1 = context.getBean("userMapper1", UserMapper.class);
        userMapper1.selectUser().forEach(System.out::println);

        // 方法3
        System.out.println("method3");
        UserMapper userMapper2 = context.getBean("userMapper2", UserMapper.class);
        userMapper2.selectUser().forEach(System.out::println);
    }
}
