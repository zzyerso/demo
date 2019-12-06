package com.yss.demo.ticket.controller;

import com.yss.demo.ticket.VO.TicketInfoVo;
import com.yss.demo.ticket.client.UserFeignClient;
import com.yss.demo.ticket.service.TicketStatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TicketController
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 买票微服务控制器
 **/
@RestController
@RequestMapping("/ticketController")
public class TicketController {

    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private TicketStatisService ticketStatisService;

    /**
     * @MethodName getTicketMessage
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 查询票务信息
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/getTicketMessage")
    public String getTicketMessage() {
        return  "Ticket Message";
    }

    @GetMapping("/getAllTicketCount")
    public String getAllTicketCount() {
        StringBuffer returnMessage = new StringBuffer();
        returnMessage.append("当前总票数为：");
        returnMessage.append(String.valueOf(ticketStatisService.countAllTicket()));
        returnMessage.append("人");
        return returnMessage.toString();
    }

    @PostMapping("/getTicketCount")
    public Long getTicketCount(TicketInfoVo ticketInfoVo) {
        return ticketStatisService.countTicketByCondition(ticketInfoVo);
    }

    /**
     * @MethodName getUserInfo
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 调用API查询用户信息
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/getUserInfo")
    public String getUserInfo() {
        return userFeignClient.getUserInfo();
    }
}
