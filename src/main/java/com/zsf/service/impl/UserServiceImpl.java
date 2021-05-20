package com.zsf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zsf.dao.UserDao;
import com.zsf.domain.User;
import com.zsf.domain.query.UserQuery;
import com.zsf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
   private UserDao userDao;

   /* @Override
    public ResultVo getAllUsers() {
        List<User> allUsers = userDao.getAllUsers();
        if(allUsers.size()==0){
            return ResultVo.error(CodeMsg.SELECT_ERROR);
        }else{
            return ResultVo.success(allUsers);
        }
    }*/


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public PageInfo<User> getUserByName(Integer pageNum,Integer pageSize,String name) {
        PageHelper.startPage(pageNum,pageSize);

        List<User> userQuery= userDao.getUserByName(name);

        return new PageInfo<User>(userQuery);
    }

  /*  @Override
    public User login(String loginName, String password) {
        return userDao.login(loginName,password);
    }*/

    @Override
    public PageInfo<User> listUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<User>(userDao.listUserByName(userQuery));
    }


}
