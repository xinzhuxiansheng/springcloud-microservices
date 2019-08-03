package com.xinzhuxiansheng.springboot.microservicea.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/microservicea")
public class ApiController {
    private static Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/api01", method = { RequestMethod.POST,RequestMethod.GET}, produces = {
        "application/json;charset=UTF-8" })
    public String api01(){

        logger.info("microserviceA");
        return restTemplate.getForEntity("http://localhost:8852/microserviceb/api01",String.class).getBody();
    }

    @RequestMapping(value = "/api02", method = { RequestMethod.POST,RequestMethod.GET}, produces = {
            "application/json;charset=UTF-8" })
    public String api02(){

        logger.info("microserviceA");
        return "ok";
    }
}
