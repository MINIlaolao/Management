package com.laoqixin.service;

import com.laoqixin.bean.User;

/**
 * @author Laoqixin
 */
public interface UserService {
    User findUser(String userId,String userPassword);
}
