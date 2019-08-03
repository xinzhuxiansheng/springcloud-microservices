package com.xinzhuxiansheng.springboot.microservicec.service;

import com.xinzhuxiansheng.springboot.microservicec.dao.mapper.UserInfoMapper;
import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;
import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceInterface")
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoModel getUserInfoByUserName(String userName){
        UserInfoModel user_info =  userInfoMapper.selectEntityByuserName(userName);
        return  user_info;
    }
}
