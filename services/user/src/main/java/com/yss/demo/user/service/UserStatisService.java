package com.yss.demo.user.service;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

import com.yss.demo.user.VO.UserInfoVo;

/**
 * @ClassName UserStatisService
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 用户统计服务接口类
 **/
public interface UserStatisService {

    /**
     * @MethodName countAllUser
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 统计所有用户数量接口
     * @Param 
     * @ReturnType Long
     **/
    abstract public Long countAllUser();

    /**
     * @MethodName countUserByCondition
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 根据条件统计用户数量接口
     * @Param userInfoVo
     * @ReturnType Long
     **/
    abstract public Long countUserByCondition(UserInfoVo userInfoVo);

    /**
     * @MethodName checkCondition
     * @Author ZhangZeyu
     * @Date 2019/12/5
     * @Version 1.0
     * @Description 检查参数并返回提示信息
     * @Param userInfoVo
     * @ReturnType String
     **/
    abstract public String checkCondition(UserInfoVo userInfoVo);
}
