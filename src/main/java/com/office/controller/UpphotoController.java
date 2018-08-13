package com.office.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

@Controller
@RequestMapping(value = "tmpInfo")
public class UpphotoController {
    @RequestMapping(value = "/method2")
    @ResponseBody
    public String method2(@RequestParam MultipartFile file) {
        JSONObject json =new JSONObject();
        String orgiginalFileName = "";
        int m =new Random().nextInt(100)+10;
        System.out.println("m="+m);
        String path="D:/test/"+m+"b.jpg";
        try {
            File newFile =new File(path);
            file.transferTo(newFile);

            String fileName = file.getName();
            InputStream inputStream = file.getInputStream();
            String content = file.getContentType();
            orgiginalFileName = file.getOriginalFilename();
            System.out.println("fileName: "+fileName+", inputStream: "+ inputStream
                    +"\r\n content: "+content+", orgiginalFileName: ="+ orgiginalFileName
                    +"\r\n projectName: ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        json.put("flag", true);
        json.put("message", "success");
        System.out.println(json.toJSONString());
        return json.toJSONString();
    }
}
