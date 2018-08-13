package com.office.controller;

import com.office.pojo.Ssubmit;
import com.office.pojo.SsubmitExample;
import com.office.service.SsubmitService;
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
public class RequestpageController {
    @Autowired
    private SsubmitService ssubmitService;

    @RequestMapping(value = "/request")
    public ModelAndView submit(ModelAndView modelAndView){
        Ssubmit ssubmit = ssubmitService.getSsubmitById(8);
        modelAndView.addObject("ssubmit",ssubmit);
        modelAndView.setViewName("request");
        return modelAndView;
    }

    @RequestMapping(value = "/submitList",method = RequestMethod.GET)
    @ResponseBody
    public List<Ssubmit> submitList(String pagenumber, String pagesize){
        Map map=new HashMap(2);
        SsubmitExample ssubmitExample=new SsubmitExample();
        return ssubmitService.selectByExample(ssubmitExample);
    }
}
