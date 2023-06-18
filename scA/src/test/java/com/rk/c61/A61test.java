package com.rk.c61;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rk.c61.bean.User;
import com.rk.c61.mapper.UserMapper;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.List;

@SpringBootTest
class A61test {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        Page sp= userMapper.selectPage(new Page(2,2),null);
        List<User> userinfo=sp.getRecords();
        System.out.println(userinfo);
    }



}
