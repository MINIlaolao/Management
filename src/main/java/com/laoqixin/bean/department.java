package com.laoqixin.bean;

/*
 *  @项目名：  PersonnelManagementSystem
 *  @包名：    com.laoqixin.bean
 *  @文件名:   department
 *  @创建者:   laoqixin
 *  @创建时间:  2018/12/10 14:52
 *  @描述：    TODO
 */
public class department {
    private static final String TAG = "department";
    private int depart_id;
    private String depart_name;

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }
}
