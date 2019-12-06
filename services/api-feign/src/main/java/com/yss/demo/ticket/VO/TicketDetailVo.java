package com.yss.demo.ticket.VO;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

/**
 * @ClassName TicketDetailVo
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 票务详情VO
 **/
public class TicketDetailVo {

    // 票务编号
    private Long ticketId;
    // 票务车次
    private Long ticketNo;
    // 票务类型
    private Long ticketType;
    // 是否售出
    private String saleFlag;
    // 购票人
    private Long userId;
    // 票务价格
    private int price;

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(Long ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Long getTicketType() {
        return ticketType;
    }

    public void setTicketType(Long ticketType) {
        this.ticketType = ticketType;
    }

    public String getSaleFlag() {
        return saleFlag;
    }

    public void setSaleFlag(String saleFlag) {
        this.saleFlag = saleFlag;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
