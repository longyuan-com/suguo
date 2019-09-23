package com.longyuan.suguo.user.service.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.longyuan.suguo.bean.User;
import com.longyuan.suguo.service.UmsMemberReceiveAddressService;
import com.longyuan.suguo.user.dao.UmsMemberReceiveAddressDao;
import org.springframework.beans.factory.annotation.Autowired;


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
