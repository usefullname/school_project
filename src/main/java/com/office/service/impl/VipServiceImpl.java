package com.office.service.impl;

import com.office.dao.VipMapper;
import com.office.pojo.Vip;
import com.office.pojo.VipExample;
import com.office.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;

@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip getVipById(Integer vipId) {
        return vipMapper.selectByPrimaryKey(vipId);
    }

    @Override
    public Vip findVipByvname(String  vname) {
        //return vipMapper.selectByvname(vname);
        VipExample vipExample = new VipExample();
        VipExample.Criteria criteria = vipExample.createCriteria();
        criteria.andVnameEqualTo(vname);
        List<Vip> list = vipMapper.selectByExample(vipExample);
        if(list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public Vip findVipByvno(Integer vno){
        VipExample vipExample = new VipExample();
        VipExample.Criteria criteria = vipExample.createCriteria();
        criteria.andVnoEqualTo(vno);
        List<Vip>list = vipMapper.selectByExample(vipExample);
        if(list.size() == 0){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    public int insertSelective(Vip vname){
        return vipMapper.insertSelective(vname);
    }

    @Override
    public  int deleteByPrimaryKey(Integer vno){
        return vipMapper.deleteByPrimaryKey(vno);
    }

    @Override
    public List<Vip> selectByExample(VipExample example){
        return  vipMapper.selectByExample(example);
    }

    @Override
    public int updateByvnameSelective(Vip vname){
        return vipMapper.updateByPrimaryKeySelective(vname);
    }
}
