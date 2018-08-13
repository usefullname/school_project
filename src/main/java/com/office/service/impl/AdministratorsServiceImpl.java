package com.office.service.impl;

import com.office.dao.AdministratorsMapper;
import com.office.pojo.Administrators;
import com.office.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorsServiceImpl implements AdministratorsService {
    @Autowired
    private AdministratorsMapper administratorsMapper;

    @Override
    public Administrators getAdministratorsById(Integer administratorsId){
        return administratorsMapper.selectByPrimaryKey(administratorsId);
    }
}
