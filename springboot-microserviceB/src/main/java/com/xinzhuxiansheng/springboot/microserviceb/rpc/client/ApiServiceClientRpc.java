package com.xinzhuxiansheng.springboot.microserviceb.rpc.client;

import com.xinzhuxiansheng.springcloud.common.rpc.serviceinterface.UserServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceClientRpc {

    @Bean
    public HessianProxyFactoryBean userClient(){
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8853/userrpc");
        factory.setServiceInterface(UserServiceInterface.class);
        return factory;
    }


}
