package com.xinzhuxiansheng.springcloud.zuul;

import com.xinzhuxiansheng.springcloud.zuul.filters.ErrorFilter;
import com.xinzhuxiansheng.springcloud.zuul.filters.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter(){
        return new SimpleFilter();
    }
    @Bean
    public ErrorFilter ErrorFilter(){
        return new ErrorFilter();
    }
}
