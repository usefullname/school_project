package com.office.service.impl;

import com.office.dao.StorehouseMapper;
import com.office.pojo.Storehouse;
import com.office.pojo.StorehouseExample;
import com.office.service.StorehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class StorehouseServiceImpl implements StorehouseService {

    @Autowired
    private StorehouseMapper storehouseMapper;

    @Override
    public Storehouse getStorehouseById(Integer storehouseId){
        return storehouseMapper.selectByPrimaryKey(storehouseId);
    }

    @Override
    public int insertSelective(Storehouse sname){
        return storehouseMapper.insertSelective(sname);
    }

    @Override
    public  Storehouse findStorehouseBysno(Integer sno){
        StorehouseExample storehouseExample = new StorehouseExample();
        StorehouseExample.Criteria criteria = storehouseExample.createCriteria();
        criteria.andSnoEqualTo(sno);
        List<Storehouse> list = storehouseMapper.selectByExample(storehouseExample);
        if(list.size()== 0){
            return null;
        }else{
            return  list.get(0);
        }
    }

    @Override
    public Storehouse findStorehouseBysname(String  sname) {
        //return vipMapper.selectByvname(vname);
        StorehouseExample storehouseExample = new StorehouseExample();
        StorehouseExample.Criteria criteria = storehouseExample.createCriteria();
        criteria.andSnameEqualTo(sname);
        List<Storehouse> list = storehouseMapper.selectByExample(storehouseExample);
        if(list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public Storehouse findStorehouseByscategory(String scategory){
        StorehouseExample storehouseExample = new StorehouseExample();
        StorehouseExample.Criteria criteria = storehouseExample.createCriteria();
        criteria.andScategoryEqualTo(scategory);
        List<Storehouse> list = storehouseMapper.selectByExample(storehouseExample);
        if(list.size() == 0){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    public  Storehouse findStorehouseByscategoryAndsname(String scategory,String sname){
        StorehouseExample storehouseExample = new StorehouseExample();
        StorehouseExample.Criteria criteria = storehouseExample.createCriteria();
        criteria.andSnameEqualTo(sname);
        criteria.andScategoryEqualTo(scategory);
        List<Storehouse>list = storehouseMapper.selectByExample(storehouseExample);
        if(list.size() == 0){
            return null;
        }
        else{
            return list.get(0);
        }
    }

    @Override
    public int updateBysnameAndscategorySelective(Storehouse sname){
        /*StorehouseExample storehouseExample = new StorehouseExample();
        StorehouseExample.Criteria criteria = storehouseExample.createCriteria();
        criteria.andScategoryEqualTo(scategory);*/
        return storehouseMapper.updateByPrimaryKeySelective(sname);
    }

    @Override
    public int deleteByPrimaryKey(Integer sno){
        return storehouseMapper.deleteByPrimaryKey(sno);
    }

    @Override
    public List<Storehouse> selectByExample(StorehouseExample example){
        return storehouseMapper.selectByExample(example);
    }
}
