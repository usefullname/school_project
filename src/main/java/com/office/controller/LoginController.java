package com.office.controller;

import com.office.dao.VipMapper;
import com.office.pojo.Vip;
import com.office.service.GlService;
import com.office.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    VipService vipService;

    @Autowired
    GlService glService;

    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(String account, String secret,String select, HttpSession session) {
        String name = account;
        String pass = secret;
        session.setAttribute("username", account);
        if (select.equals("管理员")) {
            if(glService.findGlByglname(name) == null){
                System.out.println(name);
                return "no2";
            }
            if (pass.equals(glService.findGlByglname(name).getGlpass())) {
                return "ok";
            } else {
                System.out.println(name);
                return "no";
            }
        } else {
            if(vipService.findVipByvname(name) == null){
                return "no3";
            }
            if (vipService.findVipByvname(name).getVname() != null && pass.equals(vipService.findVipByvname(name).getVpass())) {
                return "person";
            } else {
                System.out.print("no");
                return "no";
            }
        }
    }

    @RequestMapping(value = "/userregister", method = RequestMethod.POST)
    @ResponseBody
    public String userregister(String account, String secret, String secret2, HttpSession session) {
        String name = account;
        String pass = secret;
        String pass2 = secret2;
        Vip vip = new Vip();
        Vip vip1 = vipService.findVipByvname(name);
        if (!pass.equals(pass2)) {
            return "no2";
        }
        if (pass.length() < 6) {
            return "no3";
        }
        if(name.length()<1){
            return "no4";
        }
        if (vip1 == null) {
            System.out.println("11111");
            vip.setVname(name);
            vip.setVpass(pass);
            System.out.println(vip.getVname());
            vipService.insertSelective(vip);
            return "ok";
        } else {
            return "no";
        }
    }

    @RequestMapping(value = "/userupdate", method = RequestMethod.POST)
    @ResponseBody
    public String userupdate(String account,String password, String secret, String secret2, HttpSession session) {
        String name = account;
        String pass = secret;
        String pass2 = secret2;
        Vip vip = vipService.findVipByvname(name);
        if(!password.equals(vip.getVpass())){
            return "no1";
        }
        if (!pass.equals(pass2)) {
            return "no2";
        }
        if (pass.length() < 6) {
            return "no3";
        }
        vip.setVpass(pass);
        vipService.updateByvnameSelective(vip);
        return "ok";
    }

    @RequestMapping(value = "exit",method = RequestMethod.POST)
    @ResponseBody
    public String exit(HttpSession session){
        System.out.println("111");
        session.invalidate();
        return "ok";
    }
}