package com.office.service;

import com.office.pojo.Vip;
import com.office.service.impl.VipServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml"})
public class VipServiceTest {

    @Autowired
    private VipService vipService;

    @Test
    public void findVipByvname() {
//        Vip vip=vipService.findVipByvname("123456");
//        System.out.println(vip.toString());
        Vip vip = vipService.getVipById(1);
        System.out.println(vip);
    }
}