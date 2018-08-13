package com.office.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/backstage")
    public String backstage(){
        return "backstage";
    }

    @RequestMapping(value = "/")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        return "register";
    }

//    @RequestMapping(value = "/storeQuery")
//    public String storeQuery(){return "storeQuery";}

    @RequestMapping(value = "/storeAdd")
    public String storeAdd(){return "storeAdd";}

//    @RequestMapping(value = "/UserQuery")
//    public String UserQuery(){return "UserQuery";}

    @RequestMapping(value = "/storeUpdate")
    public String storeUpdate(){return "storeUpdate";}

    @RequestMapping(value = "/person")
    public String person(){return "person";}

    @RequestMapping(value = "/Prequest")
    public String Prequest(){return "Prequest";}

    @RequestMapping(value = "/fix")
    public String fix(){return "fix";}

    @RequestMapping(value = "/storeDelete")
    public String storeDelete(){return "/storeDelete";}

    @RequestMapping(value = "/UserDelete")
    public String UserDelete(){return "UserDelete";}

    @RequestMapping(value = "/RuKu")
    public String RuKu(){return "Ruku";}

    @RequestMapping(value = "/finish")
    public String finish(){
        return "finish";
    }

    @RequestMapping(value = "/sublist")
    public String sublist(){return "sublist";}

    @RequestMapping(value = "myinformation")
    public String myinformation(){return "myinformation";}
}
