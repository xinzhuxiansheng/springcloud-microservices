package com.xinzhuxiansheng.springcloud.common.rpc.model;

import java.io.Serializable;

public class UserInfoModel implements Serializable {
    private int id;
    private String userName;
    private String userPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
