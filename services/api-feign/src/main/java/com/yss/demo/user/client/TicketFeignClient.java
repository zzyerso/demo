package com.yss.demo.user.client;

import com.yss.demo.ticket.VO.TicketInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName TicketFeignClient
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 买票微服务Feign调用API
 **/
@FeignClient(name = "VO")
public interface TicketFeignClient {

    /**
     * @MethodName getTicketInfo
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description
     * @Param []
     * @ReturnType java.lang.String
     **/
    @GetMapping("/ticketController/getTicketCount")
    Long getTicketCount(TicketInfoVo ticketInfoVo);
}