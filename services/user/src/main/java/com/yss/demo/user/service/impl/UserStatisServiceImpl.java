package com.yss.demo.user.service.impl;

import com.yss.demo.user.VO.UserInfoVo;
import com.yss.demo.user.service.UserStatisService;
import org.springframework.stereotype.Service;

/**
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Description
 **/

/**
 * @ClassName UserStatisServiceImpl
 * @Author ZhangZeyu
 * @Date 2019/12/5
 * @Version 1.0
 * @Description 用户统计服务实现类
 **/
@Service
public class UserStatisServiceImpl implements UserStatisService {

    @Override
    public Long countAllUser() {
        return 6000000000L;
    }

    @Override
    public Long countUserByCondition(UserInfoVo userInfoVo) {
        return 200L;
    }

    @Override
    public String checkCondition(UserInfoVo userInfoVo) {
        StringBuffer checkResult = new StringBuffer();
        if (null == userInfoVo) {
            checkResult.append("无查询条件");
            checkResult.append("\r\n");
            return checkResult.toString();
        }
        if (null != userInfoVo.getTicketNo()) {
            checkResult.append("票务车次："+userInfoVo.getTicketNo());
            checkResult.append("\r\n");
        }
        if (null != userInfoVo.getStartStation()) {
            checkResult.append("起始车站："+userInfoVo.getStartStation());
            checkResult.append("\r\n");
        }
        if (null != userInfoVo.getEndStation()) {
            checkResult.append("目的车站："+userInfoVo.getEndStation());
            checkResult.append("\r\n");
        }
        return checkResult.toString();
    }

}
