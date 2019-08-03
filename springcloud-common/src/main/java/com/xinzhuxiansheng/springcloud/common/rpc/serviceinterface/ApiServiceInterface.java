package com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface;


import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;

public interface ApiServiceInterface {
    UserInfoModel getUserInfoByUserName(String userName);
}
