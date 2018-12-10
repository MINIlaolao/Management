package com.laoqixin.bean;

/*
 *  @项目名：  PersonnelManagementSystem
 *  @包名：    com.laoqixin.bean
 *  @文件名:   user
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/10 14:46
 *  @描述：    TODO
 */
public class user {
    private static final String TAG = "user";
    private int    user_id;
    private String user_password;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
