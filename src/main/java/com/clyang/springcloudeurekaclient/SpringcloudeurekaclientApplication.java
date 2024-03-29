package com.clyang.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SpringcloudeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayHello(){

        return "nihao"+port;
    }

}
