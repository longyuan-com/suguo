package com.longyuan.suguo.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.longyuan.suguo.bean.User;
import com.longyuan.suguo.service.UmsMemberReceiveAddressService;
import com.longyuan.suguo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Reference
    UserService userService;
    @Reference
    UmsMemberReceiveAddressService umsMemberReceiveAddressService;
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

    @RequestMapping("getReceiveAddressByMemberID")
    @ResponseBody
    public List<User> getReceiveAddressByMemberID(String memberId){
        return  umsMemberReceiveAddressService.getReceiveAddressByMemberID(memberId);
    }
}
