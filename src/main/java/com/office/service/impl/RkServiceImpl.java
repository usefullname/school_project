package com.office.service.impl;

import com.office.dao.RkMapper;
import com.office.pojo.Rk;
import com.office.pojo.RkExample;
import com.office.pojo.Sq;
import com.office.service.RkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RkServiceImpl implements RkService{
    @Autowired
    private RkMapper rkMapper;

    @Override
    public int insertSelective(Rk sno){
        return rkMapper.insertSelective(sno);
    }

    @Override
    public List<Rk> selectByExample(RkExample example){
        return rkMapper.selectByExample(example);
    }
}
