package com.office.controller;

import com.office.pojo.Vip;
import com.office.pojo.VipExample;
import com.office.service.VipService;
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
public class UserController {
    @Autowired
    private VipService vipService;

    @RequestMapping(value = "/UserQuery")
    public ModelAndView UserQuery(ModelAndView modelAndView){
        Vip vip=vipService.getVipById(1);
        modelAndView.addObject("vip",vip);
        modelAndView.setViewName("UserQuery");
        return modelAndView;
    }

    @RequestMapping(value = "/UserList",method = RequestMethod.GET)
    @ResponseBody
    public List<Vip> UserList(String pagenumber, String pagesize){
        Map map=new HashMap(2);
        VipExample vipExample=new VipExample();
        return vipService.selectByExample(vipExample);
    }
}
