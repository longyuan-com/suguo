package com.longyuan.suguo.manage.dao;


import com.longyuan.suguo.bean.PmsBaseCatalog1;
import com.longyuan.suguo.bean.PmsBaseCatalog2;
import com.longyuan.suguo.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogDao {
    public List<PmsBaseCatalog1> getCatalog1();

    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id);


}
