package com.longyuan.suguo.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.longyuan.suguo.bean.PmsBaseAttrInfo;
import com.longyuan.suguo.bean.PmsBaseCatalog1;
import com.longyuan.suguo.bean.PmsBaseCatalog2;
import com.longyuan.suguo.bean.PmsBaseCatalog3;
import com.longyuan.suguo.manage.dao.CatalogDao;
import com.longyuan.suguo.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    CatalogDao catalogDao;
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
       return catalogDao.getCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return catalogDao.getCatalog2(catalog1Id);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return catalogDao.getCatalog3(catalog2Id);
    }
}
