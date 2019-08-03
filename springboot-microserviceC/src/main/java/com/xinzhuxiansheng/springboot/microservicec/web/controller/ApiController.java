package com.xinzhuxiansheng.springboot.microservicec.web.controller;

import com.alibaba.fastjson.JSON;
import com.xinzhuxiansheng.springboot.microservicec.service.UserServiceImpl;
import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservicec")
public class ApiController {
    private static Logger logger = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/api01", method = { RequestMethod.POST,RequestMethod.GET}, produces = {
        "application/json;charset=UTF-8" })
    public String api01(){

        logger.info("microservicec");
        return "ok";
    }


    @RequestMapping(value = "/api02", method = { RequestMethod.POST,RequestMethod.GET}, produces = {
            "application/json;charset=UTF-8" })
    public String api02(){

        UserInfoModel user = userService.getUserInfoByUserName("yzhou");

        return JSON.toJSONString(user);
    }
}
