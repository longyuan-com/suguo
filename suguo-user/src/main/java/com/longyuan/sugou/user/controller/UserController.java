package com.longyuan.sugou.user.controller;

import com.longyuan.sugou.user.bean.User;
import com.longyuan.sugou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user")
    @ResponseBody
    public String index() {
        return "hello idea";
    }

    @RequestMapping("allUser")
    @ResponseBody
    public List<User> getAllUser(){
        return  userService.getAllUser();
    }
}
