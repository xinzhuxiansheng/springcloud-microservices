package com.xinzhuxiansheng.springboot.microservicec.rpc.server;

import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;

@Component
public class UserServiceServerRpc {

    @Autowired
    private UserServiceInterface apiServiceInterface;

    @Bean(name="/userrpc")
    private HessianServiceExporter getUserName(){
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(apiServiceInterface);
        exporter.setServiceInterface(UserServiceInterface.class);
        return exporter;
    }
}
