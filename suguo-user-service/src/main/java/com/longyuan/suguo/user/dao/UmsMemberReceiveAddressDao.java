package com.longyuan.suguo.user.dao;

import com.longyuan.suguo.bean.User;

import java.util.List;

public interface UmsMemberReceiveAddressDao {
    public List<User> getReceiveAddressByMemberID(String memberId);
}
