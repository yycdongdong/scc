package com.rk.c61.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rk.c61.bean.User;
import com.rk.c61.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@Controller
public class webrequest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    RestTemplate restTemplate;
    @ResponseBody
    @RequestMapping("/sayhello")
    public ArrayList<User> sayhello(){


        return restTemplate.getForObject("http://scaclient/userinfo", ArrayList.class);
    }

    @ResponseBody
    @RequestMapping("/userinfo")
    public List<User> useinfo(){

            Page sp= userMapper.selectPage(new Page(2,2),null);
            List<User> userinfo=sp.getRecords();
        System.out.println("A61");
        return userinfo;
    }

}
