package com.office.service.impl;

import com.office.dao.SsubmitMapper;
import com.office.pojo.Ssubmit;
import com.office.pojo.SsubmitExample;
import com.office.service.SsubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsubmitServiceImpl implements SsubmitService{
    @Autowired
    private SsubmitMapper ssubmitMapper;

    @Override
    public int insertSelective(Ssubmit ssname){
        return ssubmitMapper.insertSelective(ssname);
    }

    @Override
    public Ssubmit getSsubmitById(Integer ssubmitId){
        return ssubmitMapper.selectByPrimaryKey(ssubmitId);
    }

    @Override
    public List<Ssubmit> selectByExample(SsubmitExample example){
        return ssubmitMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Ssubmit ssn){
        return ssubmitMapper.updateByPrimaryKeySelective(ssn);
    }
}
