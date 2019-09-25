package com.longyuan.suguo.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.longyuan.suguo.bean.PmsBaseAttrInfo;
import com.longyuan.suguo.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {
    @Reference
    private AttrService attrService;

    //平台数据列表
    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> attrInfoList= attrService.attrInfoList(catalog3Id);
        return attrInfoList;
    }
    //平台属性增加保存
    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public boolean saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        boolean flag= attrService.saveAttrInfo(pmsBaseAttrInfo);
        return flag;
    }
}
