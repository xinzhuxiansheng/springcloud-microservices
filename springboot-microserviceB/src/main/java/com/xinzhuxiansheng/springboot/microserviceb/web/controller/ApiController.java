package com.xinzhuxiansheng.springboot.microserviceb.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microserviceb")
public class ApiController {
    private static Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(value = "/api01", method = { RequestMethod.POST,RequestMethod.GET}, produces = {
        "application/json;charset=UTF-8" })
    public String api01(){

        logger.info("microserviceB");
        return "ok";
    }
}
