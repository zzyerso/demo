package com.yss.demo.user.controller;

import com.yss.demo.ticket.VO.TicketInfoVo;
import com.yss.demo.user.VO.UserInfoVo;
import com.yss.demo.user.client.TicketFeignClient;
import com.yss.demo.user.service.UserStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 用户微服务控制器
 **/
@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private TicketFeignClient ticketFeignClient;
    @Autowired
    private UserStatisService userStatisService;

    /**
     * @MethodName postTest
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description Post请求测试方法
     * @Param []
     * @ReturnType java.lang.String
     **/
    @PostMapping("/postTest")
    public String postTest() {
        return  "post test is successed";
    }

    /**
     * @MethodName getTest
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description Get请求测试方法
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/getTest")
    public String getTest() {
        return  "get test is successed";
    }

    /**
     * @MethodName getUserMessage
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 查询用户信息
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/getAllUserCount")
    public String getAllUserCount() {
        StringBuffer returnMessage = new StringBuffer();
        returnMessage.append("当前总用户数为：");
        returnMessage.append(String.valueOf(userStatisService.countAllUser()));
        returnMessage.append("人");
        return returnMessage.toString();
    }

    /**
     * @MethodName getTicketInfo
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 调用票务服务接口查询票务信息
     * @Param []
     * @ReturnType java.lang.String
     **/
    @PostMapping("/getTicketCount")
    public String getTicketCount(TicketInfoVo ticketInfoVo) {
        StringBuffer returnMessage = new StringBuffer();
        returnMessage.append("当前剩余票为：");
        returnMessage.append(String.valueOf(ticketFeignClient.getTicketCount(ticketInfoVo)));
        returnMessage.append("张");
        return returnMessage.toString();
    }

    /**
     * @MethodName getTicketInfo
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 调用接口查询用户信息
     * @Param []
     * @ReturnType java.lang.String
     **/
    @PostMapping("/getUserCount")
    public String getUserCount(@RequestBody UserInfoVo userInfoVo) {
        StringBuffer returnMessage = new StringBuffer();
        returnMessage.append("根据查询条件：");
        returnMessage.append("\r\n");
        returnMessage.append(userStatisService.checkCondition(userInfoVo));
        returnMessage.append("当前购票用户为：");
        returnMessage.append(String.valueOf(userStatisService.countUserByCondition(userInfoVo)));
        returnMessage.append("人");
        return returnMessage.toString();
    }
}
