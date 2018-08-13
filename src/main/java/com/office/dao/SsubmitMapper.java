package com.office.dao;

import com.office.pojo.Ssubmit;
import com.office.pojo.SsubmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsubmitMapper {
    int countByExample(SsubmitExample example);

    int deleteByExample(SsubmitExample example);

    int deleteByPrimaryKey(Integer ssn);

    int insert(Ssubmit record);

    int insertSelective(Ssubmit record);

    List<Ssubmit> selectByExample(SsubmitExample example);

    Ssubmit selectByPrimaryKey(Integer ssn);

    int updateByExampleSelective(@Param("record") Ssubmit record, @Param("example") SsubmitExample example);

    int updateByExample(@Param("record") Ssubmit record, @Param("example") SsubmitExample example);

    int updateByPrimaryKeySelective(Ssubmit record);

    int updateByPrimaryKey(Ssubmit record);
}