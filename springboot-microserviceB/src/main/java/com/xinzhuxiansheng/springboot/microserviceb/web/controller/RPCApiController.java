package com.xinzhuxiansheng.springboot.microserviceb.web.controller;

import com.alibaba.fastjson.JSON;
import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;
import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.ApiServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpcapi")
public class RPCApiController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    private ApiServiceInterface apiServiceInterface;

    @RequestMapping(value = "/test", method = { RequestMethod.POST, RequestMethod.GET }, produces = {
            "application/json;charset=UTF-8" })
    public String test() {
        logger.info("test请求");
        return "ok";
    }

    @RequestMapping(value = "/username", method = { RequestMethod.POST, RequestMethod.GET }, produces = {
            "application/json;charset=UTF-8" })
    public String getUserName(String username) {
        UserInfoModel user_info = apiServiceInterface.getUserInfoByUserName(username);
        return JSON.toJSONString(user_info);
    }
}
