package com.office.service;

import com.office.pojo.Vip;
import com.office.dao.VipMapper;
import com.office.pojo.VipExample;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VipService {
    Vip getVipById(Integer vipId);
    Vip findVipByvname(String vname);
    int insertSelective(Vip vname);
    int deleteByPrimaryKey(Integer vno);
    Vip findVipByvno(Integer vno);
    List<Vip> selectByExample(VipExample example);
    int updateByvnameSelective(Vip vname);
}