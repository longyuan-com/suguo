package com.longyuan.suguo.service;


import com.longyuan.suguo.bean.User;

import java.util.List;

public interface UmsMemberReceiveAddressService {
    public List<User> getReceiveAddressByMemberID(String memberId);
}
