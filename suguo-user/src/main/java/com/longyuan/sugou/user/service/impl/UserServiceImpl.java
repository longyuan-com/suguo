package com.longyuan.sugou.user.service.impl;



import com.longyuan.sugou.user.dao.UmsMemberReceiveAddressDao;
import com.longyuan.sugou.user.dao.UserDao;
import com.longyuan.suguo.bean.User;
import com.longyuan.suguo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }


}


