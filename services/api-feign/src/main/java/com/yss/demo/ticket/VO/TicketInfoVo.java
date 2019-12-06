package com.yss.demo.ticket.VO;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

/**
 * @ClassName TicketInfoVo
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 票务信息VO
 **/
public class TicketInfoVo {

    // 票务车次
    private String ticketNo;
    // 票务类型
    private String ticketType;
    // 票起始站
    private String ticketStartStation;
    // 票终止站
    private String ticketEndStation;
    // 票务总数
    private Long ticketCount;

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketStartStation() {
        return ticketStartStation;
    }

    public void setTicketStartStation(String ticketStartStation) {
        this.ticketStartStation = ticketStartStation;
    }

    public String getTicketEndStation() {
        return ticketEndStation;
    }

    public void setTicketEndStation(String ticketEndStation) {
        this.ticketEndStation = ticketEndStation;
    }

    public Long getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Long ticketCount) {
        this.ticketCount = ticketCount;
    }
}
