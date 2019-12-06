package com.yss.demo.ticket.service;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

import com.yss.demo.ticket.VO.TicketDetailVo;
import com.yss.demo.user.VO.UserDetailVo;

/**
 * @ClassName TicketSaleService
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 票务销售服务接口类
 **/
public interface TicketSaleService {

    /**
     * @MethodName
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 购票服务接口
     * @Param userDetailVo
     * @Param ticketDetailVo
     * @ReturnType String
     **/
    abstract public String buyTickets(UserDetailVo userDetailVo, TicketDetailVo ticketDetailVo);

    /**
     * @MethodName refundTicket
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 退票服务接口
     * @Param userDetailVo
     * @Param ticketDetailVo
     * @ReturnType String
     **/
    abstract public String refundTicket(UserDetailVo userDetailVo, TicketDetailVo ticketDetailVo);
}
