package com.laoqixin.service;

import com.laoqixin.bean.User;

/*
 *  @项目名：  人员管理系统0.1
 *  @包名：    com.laoqixin.service
 *  @文件名:   UserService
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/12 10:56
 *  @描述：    TODO
 */
public interface UserService {
    User findUser(String userId,String userPassword);
}
