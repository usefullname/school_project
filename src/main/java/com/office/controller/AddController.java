package com.office.controller;

import com.office.pojo.Gl;
import com.office.pojo.Rk;
import com.office.pojo.Storehouse;
import com.office.pojo.Vip;
import com.office.service.GlService;
import com.office.service.RkService;
import com.office.service.StorehouseService;
import com.office.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/Add")
public class AddController {
    @Autowired
    StorehouseService storehouseService;

    @Autowired
    VipService vipService;

    @Autowired
    RkService rkService;

    @Autowired
    GlService glService;

    @RequestMapping(value = "/CAdd", method = RequestMethod.POST)
    @ResponseBody
    public String cAdd(String cmade, String cname, String cnumber, HttpSession session) {
        if(cmade.length()<1|| cname.length()<1|| cnumber.length()<1){
        System.out.println("jinru");
        return "no2";
    }
        String made = cmade;
        String name = cname;
        String number = cnumber;
        String admname = String .valueOf(session.getAttribute("username").toString());

        Gl gl = glService.findGlByglname(admname);
        int thisnum;
        int numberNOW = Integer.parseInt(number);
        String numberend;
        Rk rk = new Rk();
        Storehouse storehouse = new Storehouse();
        Storehouse cnameNOW = storehouseService.findStorehouseByscategoryAndsname(made,name);
        if (cnameNOW == null) {
            storehouse.setScategory(made);
            storehouse.setSname(name);
            storehouse.setSnumber(number);
            storehouseService.insertSelective(storehouse);
            Storehouse storehouse1 = storehouseService.findStorehouseByscategoryAndsname(made,name);
            int sno = storehouse1.getSno();
            System.out.println(sno);
            rk.setSno(sno);
            System.out.println(rk.getSno());
            rk.setRknumber(cnumber);
            System.out.println(rk.getRknumber());
            rk.setRkperson("admin");
            rkService.insertSelective(rk);
            return "ok1";
        } else{
//            if (name.equals(storehouseService.findStorehouseByscategoryAndsname(made,name).getSname())) {
//            if (made.equals(storehouseService.findStorehouseBysname(name).getScategory())) {
                thisnum = Integer.parseInt(storehouseService.findStorehouseByscategoryAndsname(made, name).getSnumber());
                thisnum += numberNOW;
                numberend = String.valueOf(thisnum);
                cnameNOW.setSnumber(numberend);
                storehouseService.updateBysnameAndscategorySelective(cnameNOW);
                Storehouse storehouse1 = storehouseService.findStorehouseByscategoryAndsname(made,name);
                int sno = storehouse1.getSno();
                rk.setSno(sno);
                rk.setRknumber(cnumber);
                rk.setRkperson(gl.getGlname());
                rk.setAno(gl.getGlno());
                rkService.insertSelective(rk);
                return "ok2";
            }
//            else {
//                storehouse.setScategory(made);
//                storehouse.setSname(name);
//                storehouse.setSnumber(number);
//                storehouseService.insertSelective(storehouse);
//                Storehouse storehouse1 = storehouseService.findStorehouseByscategoryAndsname(made,name);
//                int sno = storehouse1.getSno();
//                System.out.println(sno);
//                rk.setSno(sno);
//                System.out.println(rk.getSno());
//                rk.setRknumber(cnumber);
//                System.out.println(rk.getRknumber());
//                rk.setRkperson("admin");
//                rkService.insertSelective(rk);
//                return "no";
//            }
//        } else {
//            storehouse.setScategory(made);
//            storehouse.setSname(name);
//            storehouse.setSnumber(cnumber);
//            storehouseService.insertSelective(storehouse);
//            Storehouse storehouse1 = storehouseService.findStorehouseByscategoryAndsname(made,name);
//            int sno = storehouse1.getSno();
//            System.out.println(sno);
//            rk.setSno(sno);
//            System.out.println(rk.getSno());
//            rk.setRknumber(cnumber);
//            System.out.println(rk.getRknumber());
//            rk.setRkperson("admin");
//            rkService.insertSelective(rk);
//            return "nom";
//        }
    }

    @RequestMapping(value = "/CUpdate", method = RequestMethod.POST)
    @ResponseBody
    public String cupdate(Integer thisno,String cmade, String cname, String cnumber, HttpSession session) {
        if(thisno == null){
            return "no2";
        }
        Storehouse storehouse = storehouseService.findStorehouseBysno(thisno);
        if(storehouse == null) {
            return "no1";
        }
        Storehouse storehouse1 = storehouseService.findStorehouseByscategoryAndsname(cmade,cname);
        if(storehouse1 != null && storehouse1.getSno() != thisno){
            return "no3";
        }
        if(cnumber.length()<1){
            return "no4";
        }
        if(cname.length()<1){

        }
        else{
            storehouse.setSname(cname);
        }
        if(cmade.length()<1){

        }
        else{
            storehouse.setScategory(cmade);
        }
        storehouse.setSnumber(cnumber);
        storehouseService.updateBysnameAndscategorySelective(storehouse);
        return "ok1";
    }
//        String made = cmade;
//        String name = cname;
//        String number = cnumber;
//        Storehouse storehouse = storehouseService.findStorehouseBysname(name);
//        Storehouse storehouse1 = storehouseService.findStorehouseByscategory(made);
//        if(storehouse != null) {
//            if (name.equals(storehouseService.findStorehouseBysname(name).getSname())) {
//                if (made.equals(storehouseService.findStorehouseBysname(name).getScategory()) && (!number.equals(storehouseService.findStorehouseBysname(name).getSnumber()))) {
//                    storehouse.setSnumber(number);
//                    storehouseService.updateBysnameAndscategorySelective(storehouse);
//                    return "ok1";
//                } else if (number.equals(storehouseService.findStorehouseBysname(name).getSnumber()) && (!made.equals(storehouseService.findStorehouseBysname(name).getScategory()))) {
//                    storehouse.setScategory(made);
//                    storehouseService.updateBysnameAndscategorySelective(storehouse);
//                    return "ok1";
//                } else {
//                    return "no2";
//                }
//            }
//        }if(storehouse1 != null) {
//            if (made.equals(storehouseService.findStorehouseByscategory(made).getScategory())) {
//                if (name.equals(storehouseService.findStorehouseByscategory(made).getSname()) && (!number.equals(storehouseService.findStorehouseByscategory(made).getSnumber()))) {
//                    storehouse1.setSnumber(number);
//                    storehouseService.updateBysnameAndscategorySelective(storehouse1);
//                    return "ok1";
//                } else if (number.equals(storehouseService.findStorehouseByscategory(made).getSnumber()) && (!name.equals(storehouseService.findStorehouseByscategory(made).getSname()))) {
//                    storehouse1.setSname(name);
//                    storehouseService.updateBysnameAndscategorySelective(storehouse1);
//                    return "ok1";
//                } else {
//                    return "no2";
//                }
//            }
//        }
//        return "no1";
//    }

    @RequestMapping(value = "/CDelete", method = RequestMethod.POST)
    @ResponseBody
    public String cdelete(String cmade, String cname, HttpSession session) {
        String name = cname;
        String made = cmade;
        if(cmade.length()<1 || cname.length()<1 ){
            return "no2";
        }
        Storehouse storehouse = storehouseService.findStorehouseByscategoryAndsname(made,name);
        System.out.println(storehouse.getSno());
        System.out.println(storehouse.getSname());
        if(storehouse !=null){
            storehouseService.deleteByPrimaryKey(storehouse.getSno());
            return "ok";
        }
        return "no";
    }

    @RequestMapping(value = "/UDelete", method = RequestMethod.POST)
    @ResponseBody
    public String udelete(String  uid, HttpSession session) {
        if(uid.length()<1){
            return "no2";
        }
        String  thisid = uid;
        int id = Integer.parseInt(thisid);
        Vip vip = vipService.findVipByvno(id);
        System.out.println(vip.getVname());
        System.out.println(vip.getVno());
        if(vip !=null){
            vipService.deleteByPrimaryKey(vip.getVno());
            return "ok";
        }
        return "no";
    }

}
