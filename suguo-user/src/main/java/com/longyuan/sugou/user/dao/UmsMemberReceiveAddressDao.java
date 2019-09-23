package com.longyuan.sugou.user.dao;

import com.longyuan.suguo.bean.User;

import java.util.List;

public interface UmsMemberReceiveAddressDao {
    public List<User> getReceiveAddressByMemberID(String  memberId);
}
