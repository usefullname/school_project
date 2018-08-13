package com.office.service;

import com.office.pojo.Rk;
import com.office.pojo.RkExample;

import java.util.List;

public interface RkService {
    int insertSelective(Rk sno);
    List<Rk> selectByExample(RkExample example);
}
