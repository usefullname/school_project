package com.office.service;

import com.office.pojo.Ssubmit;
import com.office.pojo.SsubmitExample;

import java.util.List;

public interface SsubmitService {
    int insertSelective(Ssubmit ssname);
    Ssubmit getSsubmitById(Integer ssubmitId);
    List<Ssubmit> selectByExample(SsubmitExample example);
    int updateByPrimaryKeySelective(Ssubmit ssn);
}
