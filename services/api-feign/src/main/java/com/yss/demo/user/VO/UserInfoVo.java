package com.yss.demo.user.VO;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

/**
 * @ClassName UserInfoVo
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 购票人员信息VO
 **/
public class UserInfoVo {

    // 票务车次
    private String ticketNo;
    // 用户起始站
    private String startStation;
    // 用户终止站
    private String endStation;
    // 用户数量
    private String userCount;

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }
}
