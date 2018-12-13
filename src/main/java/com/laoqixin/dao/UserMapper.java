package com.laoqixin.dao;

import com.laoqixin.bean.User;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 实现登录业务
     * @param userid
     * @param userpassword
     * @return
     */
    User findUser(@Param("user_id") String userid,@Param("user_password") String userpassword);
}