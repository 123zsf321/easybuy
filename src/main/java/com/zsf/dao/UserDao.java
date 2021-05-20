package com.zsf.dao;

import com.zsf.domain.User;
import com.zsf.domain.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    //查询所有用户

    public List<User> getAllUsers();

    //根据用户名查询并分页展示
    public List<User> getUserByName(@Param("userName") String userName);

   /* //登录
    User login(@Param("loginName") String loginName,@Param("password") String password);*/

    // 根据用户名来查询用户  并分页展示
    public List<User> listUserByName(UserQuery userQuery);

}
