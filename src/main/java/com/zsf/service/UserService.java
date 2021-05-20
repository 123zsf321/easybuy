package com.zsf.service;

import com.github.pagehelper.PageInfo;
import com.zsf.domain.User;
import com.zsf.domain.query.UserQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {



    //查询全部
    public List<User> getAllUsers();


    //根据用户名查询并分页展示
    public PageInfo<User> getUserByName(Integer pageNum,Integer pageSize,String name);
    // 根据用户名来查询用户  并分页展示
    public PageInfo<User> listUserByName(UserQuery userQuery);


   /* //登录
    User login(String loginName, String password);*/

}
