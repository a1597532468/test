package com.example.mint.model.entity;

public class Users {
    private Integer userId;//id
    private String userWebName;//平台姓名
    private String userPhone;//电话号码
    private String userPassWord;//用户登录密码
    private Integer userRole;//1.客户2.商家
    private Integer userStatus;//用户状态

    public Users(Integer userId, String userWebName, String userPhone, String userPassWord, Integer userRole, Integer userStatus) {
        this.userId = userId;
        this.userWebName = userWebName;
        this.userPhone = userPhone;
        this.userPassWord = userPassWord;
        this.userRole = userRole;
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserWebName() {
        return userWebName;
    }

    public void setUserWebName(String userWebName) {
        this.userWebName = userWebName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
