package com.longyuan.sugou.user.service.impl;

import com.longyuan.sugou.user.bean.User;
import com.longyuan.sugou.user.dao.UserDao;
import com.longyuan.sugou.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}


