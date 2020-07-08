package com.laoqixin.service.impl;

import com.laoqixin.bean.User;
import com.laoqixin.dao.UserMapper;
import com.laoqixin.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *  @author Laoqixin
 * @项目名：  renyuanguanlixitong0.2
 *  @包名：    com.laoqixin.service.impl
 *  @文件名:   UserServiceImpl
 *
 *  @创建时间:  2018/12/12 22:55
 *  @描述：    TODO
 */
@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUser(String userId, String userPassword) {
        return userMapper.findUser(userId,userPassword);
    }
}
