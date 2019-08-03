package com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface;


import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;

public interface UserServiceInterface {
    UserInfoModel getUserInfoByUserName(String userName);
}
