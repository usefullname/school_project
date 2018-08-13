package com.office.controller;

import com.office.pojo.*;
import com.office.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/Submit")
public class SubmitController {
    @Autowired
    private StorehouseService storehouseService;

    @Autowired
    private VipService vipService;

    @Autowired
    private SsubmitService ssubmitService;

    @Autowired
    private GlService glService;

    @Autowired
    private SqService sqService;

    @RequestMapping(value = "/Sq",method = RequestMethod.POST)
    @ResponseBody
    public String  submit(String ssname,String uudepartment,String sssname,String ssstype,String sssnumber,String sstime, HttpSession session){
        String thisnum = sssnumber;
        String thistime = sstime;
        String suname = String .valueOf(session.getAttribute("username").toString());
        int num = Integer.parseInt(thisnum);
        float time = Float.parseFloat(thistime);
        Ssubmit ssubmit = new Ssubmit();
        Storehouse storehouse = storehouseService.findStorehouseByscategoryAndsname(ssstype,sssname);
        Vip vip = vipService.findVipByvname(ssname);
        if(!suname.equals(ssname)){
            return "no4";
        }
        if(vip == null){
            return "no3";
        }
        if(storehouse == null){
            return "no1";
        }
        String  thishavenum = storehouse.getSnumber();
        int havenum = Integer.parseInt(thishavenum);
        if(num>havenum){
            return "no2";
        }
        ssubmit.setVno(vip.getVno());
        ssubmit.setSsdepartment(uudepartment);
        ssubmit.setSsname(ssname);
        ssubmit.setSssnumber(sssnumber);
        ssubmit.setSssname(sssname);
        ssubmit.setSsstype(ssstype);
        ssubmit.setSstime(time);
        ssubmitService.insertSelective(ssubmit);
        return "ok";
    }

    @RequestMapping(value = "/Permit",method = RequestMethod.POST)
    @ResponseBody
    public String permit(String ssn,HttpSession session){
        String admname = String .valueOf(session.getAttribute("username").toString());
        int thisssn = Integer.parseInt(ssn);
        Ssubmit ssubmit = ssubmitService.getSsubmitById(thisssn);
        String uname = ssubmit.getSsname();
        String cname = ssubmit.getSssname();
        String thiscnum = ssubmit.getSssnumber();
        int cnum = Integer.parseInt(thiscnum);
        String ctype = ssubmit.getSsstype();
        Vip vip = vipService.findVipByvname(uname);
        Gl gl = glService.findGlByglname(admname);
        Storehouse storehouse = storehouseService.findStorehouseByscategoryAndsname(ctype,cname);
        int havecnum = Integer.parseInt(storehouse.getSnumber());
        if(ssubmit.getAno() !=null){
            return "no3";
        }
        if (vip == null){
            return "no1";
        }
        if(cnum>havecnum){
            return "no2";
        }
        int endnum = havecnum - cnum;
        String numend = String .valueOf(endnum);
        storehouse.setSnumber(numend);
        storehouseService.updateBysnameAndscategorySelective(storehouse);
        ssubmit.setAno(gl.getGlno());
        ssubmitService.updateByPrimaryKeySelective(ssubmit);
        Sq sq = new Sq();
        sq.setUudepartment(ssubmit.getSsdepartment());
        sq.setUtime(ssubmit.getSstime());
        sq.setUstype(ssubmit.getSsstype());
        sq.setUsnumber(Integer.parseInt(ssubmit.getSssnumber()));
        sq.setUsname(ssubmit.getSsname());
        sq.setUaname(gl.getGlname()+"通过");
        sq.setUuname(ssubmit.getSssname());
        sq.setSno(storehouse.getSno());
        sq.setSsn(ssubmit.getSsn());
        sqService.insertSelective(sq);
        return "ok";
    }

    @RequestMapping(value = "/refuse",method = RequestMethod.POST)
    @ResponseBody
    public String refuse(String ssn,HttpSession session){
        String admname = String .valueOf(session.getAttribute("username").toString());
        int thisssn = Integer.parseInt(ssn);
        Ssubmit ssubmit = ssubmitService.getSsubmitById(thisssn);
        String cname = ssubmit.getSssname();
        String ctype = ssubmit.getSsstype();
        Gl gl = glService.findGlByglname(admname);
        Storehouse storehouse = storehouseService.findStorehouseByscategoryAndsname(ctype,cname);
        if(ssubmit.getAno()!=null){
            return "no1";
        }
        ssubmit.setAno(gl.getGlno());
        ssubmitService.updateByPrimaryKeySelective(ssubmit);
        Sq sq = new Sq();
        sq.setUudepartment(ssubmit.getSsdepartment());
        sq.setUtime(ssubmit.getSstime());
        sq.setUstype(ssubmit.getSsstype());
        sq.setUsnumber(Integer.parseInt(ssubmit.getSssnumber()));
        sq.setUsname(ssubmit.getSsname());
        sq.setUaname(gl.getGlname()+"拒绝");
        sq.setUuname(ssubmit.getSssname());
        sq.setSno(storehouse.getSno());
        sq.setSsn(ssubmit.getSsn());
        sqService.insertSelective(sq);
        return "ok";
    }
}
