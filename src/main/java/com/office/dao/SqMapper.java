package com.office.dao;

import com.office.pojo.Sq;
import com.office.pojo.SqExample;
import com.office.pojo.SqKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqMapper {
    int countByExample(SqExample example);

    int deleteByExample(SqExample example);

    int deleteByPrimaryKey(SqKey key);

    int insert(Sq record);

    int insertSelective(Sq record);

    List<Sq> selectByExample(SqExample example);

    Sq selectByPrimaryKey(SqKey key);

    int updateByExampleSelective(@Param("record") Sq record, @Param("example") SqExample example);

    int updateByExample(@Param("record") Sq record, @Param("example") SqExample example);

    int updateByPrimaryKeySelective(Sq record);

    int updateByPrimaryKey(Sq record);
}