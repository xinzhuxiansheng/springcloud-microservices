package com.xinzhuxiansheng.springcloud.zuul.api.controller;

import com.netflix.zuul.exception.ZuulException;
import org.apache.catalina.connector.RequestFacade;
import org.apache.coyote.Request;
import org.apache.tomcat.util.buf.MessageBytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.util.Map;

@RestController
public class ErrorHandlerController implements ErrorController {

    @Autowired
    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return "/error";
    }

    /*@RequestMapping("/error")
    public Object error(HttpServletRequest request, HttpServletResponse response){
        //
        *//*RequestContext ctx = RequestContext.getCurrentContext();
        ZuulException exception = (ZuulException)ctx.getThrowable();
        return Result.choose(exception.nStatusCode, exception.getMessage());*//*
        Integer status = (Integer)request.getAttribute("javax.servlet.error.status_code");
        return Result.choose(status, status == 404 ? "访问地址不存在" : "内部服务器错误,正在处理");
    }*/

    @RequestMapping("/error")
    public String error(HttpServletRequest request, HttpServletResponse response, ServletRequest servletRequest) {
        //System.out.println(request.getRequestURL());
        Map<String,Object> errorAttributes = getErrorAttributes(request, true);
        String path=(String)errorAttributes.get("path");
        //Integer status = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Integer status =  (Integer)errorAttributes.get("status");
        System.out.println(path);
        if (status == 404) {
            return "地址不存在";
        } else {
            return "服务异常";
        }
        //return "服务异常";
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        RequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    }
}
