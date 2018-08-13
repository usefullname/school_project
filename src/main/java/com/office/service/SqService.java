package com.office.service;

import com.office.pojo.Sq;
import com.office.pojo.SqExample;

import java.util.List;

public interface SqService {
    int insertSelective(Sq ssn);
    List<Sq> selectByExample(SqExample example);
    int updateByssnSelective(Sq ssn);
    Sq findSqByssn(Integer ssn);
}
