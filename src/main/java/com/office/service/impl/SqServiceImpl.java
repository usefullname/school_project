package com.office.service.impl;

import com.office.dao.SqMapper;
import com.office.pojo.Sq;
import com.office.pojo.SqExample;
import com.office.service.SqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class SqServiceImpl implements SqService {
    @Autowired
    private SqMapper sqMapper;

    @Override
    public int insertSelective(Sq ssn){
        return sqMapper.insertSelective(ssn);
    }

    @Override
    public List<Sq> selectByExample(SqExample example){
        return sqMapper.selectByExample(example);
    }

    @Override
    public  int updateByssnSelective(Sq ssn){
        return sqMapper.updateByPrimaryKeySelective(ssn);
    }

    @Override
    public Sq findSqByssn(Integer ssn){
        SqExample sqExample = new SqExample();
        SqExample.Criteria criteria = sqExample.createCriteria();
        criteria.andSsnEqualTo(ssn);
        List<Sq>list = sqMapper.selectByExample(sqExample);
        if(list.size() == 0){
            return null;
        }
        else {
            return list.get(0);
        }
    }
}
