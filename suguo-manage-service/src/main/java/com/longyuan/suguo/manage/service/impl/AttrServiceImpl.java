package com.longyuan.suguo.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.longyuan.suguo.bean.PmsBaseAttrInfo;
import com.longyuan.suguo.bean.PmsBaseAttrValue;
import com.longyuan.suguo.manage.dao.PmsBaseAttrInfoMapper;
import com.longyuan.suguo.manage.dao.PmsBaseAttrValueMapper;
import com.longyuan.suguo.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    //平台属性值
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo =new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return pmsBaseAttrInfos;
    }

    @Override
    public boolean saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        try {
            //保存属性
            pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            //保存属性值
            List<PmsBaseAttrValue> attrValueList =pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
