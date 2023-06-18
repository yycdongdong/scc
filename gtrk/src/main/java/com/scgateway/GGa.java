package com.scgateway;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GGa {
    public static void main(String[] args) {
        SpringApplication.run(GGa.class,args);
    }
    @Bean
    public IRule NacosR(){
        return new NacosRule();
    }
}
