package com.office.dao;

import com.office.pojo.Gl;
import com.office.pojo.GlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlMapper {
    int countByExample(GlExample example);

    int deleteByExample(GlExample example);

    int deleteByPrimaryKey(Integer glno);

    int insert(Gl record);

    int insertSelective(Gl record);

    List<Gl> selectByExample(GlExample example);

    Gl selectByPrimaryKey(Integer glno);

    int updateByExampleSelective(@Param("record") Gl record, @Param("example") GlExample example);

    int updateByExample(@Param("record") Gl record, @Param("example") GlExample example);

    int updateByPrimaryKeySelective(Gl record);

    int updateByPrimaryKey(Gl record);
}