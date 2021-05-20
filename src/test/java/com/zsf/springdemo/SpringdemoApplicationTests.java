package com.zsf.springdemo;

import com.github.pagehelper.PageInfo;
import com.zsf.domain.User;
import com.zsf.domain.query.UserQuery;
import com.zsf.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest

@RunWith(SpringJUnit4ClassRunner.class)
class SpringdemoApplicationTests {
    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
        PageInfo<User> pageInfo= userService.getUserByName(1,5,"系");
        System.out.println(pageInfo.toString());
    }

}
