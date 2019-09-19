package com.longyuan.sugou.user.controller;

import com.longyuan.sugou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserContrller {

    @Autowired
    UserService userService;

}
