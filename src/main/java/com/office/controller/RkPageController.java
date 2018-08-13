package com.office.controller;

import com.office.pojo.Rk;
import com.office.pojo.RkExample;
import com.office.service.RkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class RkPageController {
    @Autowired
    private RkService rkService;

    @RequestMapping(value = "/RkList",method = RequestMethod.GET)
    @ResponseBody
    public List<Rk> UserList(String pagenumber, String pagesize){
        Map map=new HashMap(2);
        RkExample rkExample=new RkExample();
        return rkService.selectByExample(rkExample);
    }
}
