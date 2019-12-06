package com.yss.demo.ticket.service;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

import com.yss.demo.ticket.VO.TicketInfoVo;

/**
  * @ClassName TicketStatisService
  * @Author ZhangZeyu
  * @Date 2019/12/5
  * @Version 1.0
  * @Description 票务统计服务接口类
  **/
public interface TicketStatisService {

     /**
      * @MethodName countAllTicket
      * @Author ZhangZeyu
      * @Date 2019/12/5
      * @Version 1.0
      * @Description 统计所有票数量接口
      * @Param
      * @ReturnType Long
      **/
     abstract public Long countAllTicket();

     /**
      * @MethodName countTicketByCondition
      * @Author ZhangZeyu
      * @Date 2019/12/5
      * @Version 1.0
      * @Description 根据条件统计票数量接口
      * @Param
      * @ReturnType Long
      **/
     abstract public Long countTicketByCondition(TicketInfoVo ticketInfoVo);
}
