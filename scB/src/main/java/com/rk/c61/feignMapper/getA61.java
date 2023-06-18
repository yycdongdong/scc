package com.rk.c61.feignMapper;

import com.rk.c61.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("scaclient")
public interface getA61 {
    @RequestMapping("/userinfo")
    List<User> useinfo();
}
