package com.xinzhuxiansheng.springboot.microservicec.dao.mapper;

import com.xinzhuxiansheng.springcloud.common.rpc.model.UserInfoModel;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    UserInfoModel selectEntityByuserName(@Param("username") String username);
}
