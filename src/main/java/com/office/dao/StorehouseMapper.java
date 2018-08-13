package com.office.dao;

import com.office.pojo.Storehouse;
import com.office.pojo.StorehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseMapper {
    int countByExample(StorehouseExample example);

    int deleteByExample(StorehouseExample example);

    int deleteByPrimaryKey(Integer sno);

    int insert(Storehouse record);

    int insertSelective(Storehouse record);

    List<Storehouse> selectByExample(StorehouseExample example);

    Storehouse selectByPrimaryKey(Integer sno);

    int updateByExampleSelective(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByExample(@Param("record") Storehouse record, @Param("example") StorehouseExample example);

    int updateByPrimaryKeySelective(Storehouse record);

    int updateByPrimaryKey(Storehouse record);
}