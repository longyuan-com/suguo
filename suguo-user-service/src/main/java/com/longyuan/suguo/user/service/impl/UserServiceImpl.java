package com.longyuan.suguo.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.longyuan.suguo.bean.User;
import com.longyuan.suguo.service.UserService;
import com.longyuan.suguo.user.dao.UmsMemberReceiveAddressDao;
import com.longyuan.suguo.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;


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


