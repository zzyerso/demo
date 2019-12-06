package com.yss.demo.ticket.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName UserFeignClient
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 用户微服务Feign调用API
 **/
@FeignClient(name = "user")
public interface UserFeignClient {

    /**
     * @MethodName getUserInfo
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/userController/getUserMessage")
    String getUserInfo();
}