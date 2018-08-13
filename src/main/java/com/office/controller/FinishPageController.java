package com.office.controller;

import com.office.pojo.Sq;
import com.office.pojo.SqExample;
import com.office.service.SqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FinishPageController {
    @Autowired
    private SqService sqService;

    @RequestMapping(value = "/finishList",method = RequestMethod.GET)
    @ResponseBody
    public List<Sq> submitList(String pagenumber, String pagesize){
        SqExample sqExample=new SqExample();
        return sqService.selectByExample(sqExample);
    }
}
