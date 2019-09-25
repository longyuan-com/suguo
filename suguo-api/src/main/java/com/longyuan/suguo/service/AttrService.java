package com.longyuan.suguo.service;

import com.longyuan.suguo.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    public boolean saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
