package com.yss.demo.ticket.service.impl;


import com.yss.demo.ticket.VO.TicketInfoVo;
import com.yss.demo.ticket.service.TicketStatisService;
import org.springframework.stereotype.Service;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

/**
 * @ClassName TicketStatisServiceImpl
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 票务统计服务实现类
 **/
@Service
public class TicketStatisServiceImpl implements TicketStatisService {

    @Override
    public Long countAllTicket() {
        return 100L;
    }

    @Override
    public Long countTicketByCondition(TicketInfoVo ticketInfoVo) {
        return 3L;
    }
}
