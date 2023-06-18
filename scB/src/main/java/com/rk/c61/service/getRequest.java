package com.rk.c61.service;
import com.rk.c61.bean.User;
import com.rk.c61.feignMapper.getA61;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class getRequest {
    @Autowired
    getA61 ga;

    @ResponseBody
    @RequestMapping("/getRequest")
    public List<User> getRequest(){

        System.out.println("B61");
        return ga.useinfo();
    }
    @ResponseBody
    @RequestMapping("/getString")
    public String getstr(){
        return "hello hihi61";
    }

}
