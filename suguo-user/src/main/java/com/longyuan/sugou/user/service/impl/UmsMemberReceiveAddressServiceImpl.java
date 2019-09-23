package com.longyuan.sugou.user.service.impl;


import com.longyuan.sugou.user.dao.UmsMemberReceiveAddressDao;
import com.longyuan.suguo.bean.User;
import com.longyuan.suguo.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {
    @Autowired
    UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;

    @Override
    public List<User> getReceiveAddressByMemberID(String memberId) {
        return umsMemberReceiveAddressDao.getReceiveAddressByMemberID(memberId);
    }
}
