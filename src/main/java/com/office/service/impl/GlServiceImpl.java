package com.office.service.impl;

import com.office.dao.GlMapper;
import com.office.pojo.Gl;
import com.office.pojo.GlExample;
import com.office.service.GlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GlServiceImpl implements GlService {

    @Autowired
    private GlMapper glMapper;

    @Override
    public Gl findGlByglname(String  glname) {
        GlExample glExample = new GlExample();
        GlExample.Criteria criteria = glExample.createCriteria();
        criteria.andGlnameEqualTo(glname);
        List<Gl>list=glMapper.selectByExample(glExample);
        return  list.get(0);
    }
}
