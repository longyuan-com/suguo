package com.longyuan.suguo.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.longyuan.suguo.bean.PmsBaseAttrInfo;
import com.longyuan.suguo.bean.PmsBaseCatalog1;
import com.longyuan.suguo.bean.PmsBaseCatalog2;
import com.longyuan.suguo.bean.PmsBaseCatalog3;
import com.longyuan.suguo.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;
    //一级分类
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
       List<PmsBaseCatalog1> catalog1s= catalogService.getCatalog1();
        return catalog1s;
    }
    //二级分类
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2s= catalogService.getCatalog2(catalog1Id);
        return catalog2s;
    }
    //三级分类
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3s= catalogService.getCatalog3(catalog2Id);
        return catalog3s;
    }

}
