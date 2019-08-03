package com.xinzhuxiansheng.springboot.microserviceb.service;

import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;
import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.ApiServiceInterface;
import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiServiceInterface {

    @Autowired
    UserServiceInterface userServiceInterface;

    @Override
    public UserInfoModel getUserInfoByUserName(String userName) {
        UserInfoModel user_info = userServiceInterface.getUserInfoByUserName(userName);
        return user_info;
    }
}
