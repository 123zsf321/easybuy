package com.zsf.controller;

import com.github.pagehelper.PageInfo;
import com.zsf.domain.User;
import com.zsf.domain.query.UserQuery;
import com.zsf.service.UserService;
import com.zsf.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/*
@RestController
@RequestMapping(value = "/try")
@EnableAutoConfiguration*/

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /*@GetMapping("/q")
    @ResponseBody
    public PageInfo index(Model model, Integer pageNum,Integer pageSize,String name){
        PageInfo<User> userPageInfo = userService.getUserByName(pageNum, pageSize, name);
        model.addAttribute("page",userPageInfo);
        return userPageInfo;
    }*/
    @GetMapping("/FF")
    public String  ff(Model model){
      List<User> users=userService.getAllUsers();
      model.addAttribute("page",users);
      return "index";
    }

    @GetMapping("/s")
    public String index(Model model, UserQuery userQuery){
        PageInfo<User> userPageInfo = userService.listUserByName(userQuery);
        model.addAttribute("page",userPageInfo);
        return "indexs";
    }


}
