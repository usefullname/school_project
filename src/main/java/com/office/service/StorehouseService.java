package com.office.service;

import com.office.pojo.Storehouse;
import com.office.pojo.StorehouseExample;

import java.util.List;

public interface StorehouseService {
    Storehouse getStorehouseById(Integer storehouseId);
    int insertSelective(Storehouse sname);
    Storehouse findStorehouseBysname(String sname);
    Storehouse findStorehouseByscategory(String scategory);
    Storehouse findStorehouseByscategoryAndsname(String scategory,String sname);
    int updateBysnameAndscategorySelective(Storehouse name);
    int deleteByPrimaryKey(Integer sno);
    List<Storehouse> selectByExample(StorehouseExample example);
    Storehouse findStorehouseBysno(Integer  sno);
}