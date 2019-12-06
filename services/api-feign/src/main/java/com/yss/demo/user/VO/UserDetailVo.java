package com.yss.demo.user.VO;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

import java.math.BigDecimal;

/**
 * @ClassName UserDetailVo
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 购票人员详情信息VO
 **/
public class UserDetailVo {

    // 用户唯一标识
    private Long userId;
    // 用户名称
    private String userName;
    // 用户年龄
    private int userAge;
    // 用户性别
    private String userSex;
    // 用户居住地
    private String permanentResidence;
    // 用户现居地
    private String currentResidence;
    // 账户余额
    private BigDecimal balance;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getPermanentResidence() {
        return permanentResidence;
    }

    public void setPermanentResidence(String permanentResidence) {
        this.permanentResidence = permanentResidence;
    }

    public String getCurrentResidence() {
        return currentResidence;
    }

    public void setCurrentResidence(String currentResidence) {
        this.currentResidence = currentResidence;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
