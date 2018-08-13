package com.office.dao;

import com.office.pojo.Rk;
import com.office.pojo.RkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RkMapper {
    int countByExample(RkExample example);

    int deleteByExample(RkExample example);

    int deleteByPrimaryKey(Integer rkno);

    int insert(Rk record);

    int insertSelective(Rk record);

    List<Rk> selectByExample(RkExample example);

    Rk selectByPrimaryKey(Integer rkno);

    int updateByExampleSelective(@Param("record") Rk record, @Param("example") RkExample example);

    int updateByExample(@Param("record") Rk record, @Param("example") RkExample example);

    int updateByPrimaryKeySelective(Rk record);

    int updateByPrimaryKey(Rk record);
}