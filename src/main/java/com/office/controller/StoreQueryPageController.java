package com.office.controller;

import com.office.pojo.Storehouse;
import com.office.pojo.StorehouseExample;
import com.office.service.StorehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StoreQueryPageController {
    @Autowired
    private StorehouseService storehouseService;

    @RequestMapping("/storeQuery")
    public ModelAndView storeQuery(ModelAndView modelAndView){
        Storehouse storehouse=storehouseService.getStorehouseById(1);
        modelAndView.addObject("storehouse",storehouse);
        modelAndView.setViewName("storeQuery");
        return modelAndView;
    }

    @RequestMapping(value = "/storehouseList",method = RequestMethod.GET)
    @ResponseBody
    public List<Storehouse> UserList(String pagenumber, String pagesize){
        Map map=new HashMap(2);
        StorehouseExample storehouseExample=new StorehouseExample();
        return storehouseService.selectByExample(storehouseExample);
    }
}
