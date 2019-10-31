package com.lgmn.yzx.starter.model;

public class SendSmsEntity {

    private String mobile;  // 手机号      必传
    private String param;   // 模板参数    有参数时必传
    private String uid;     // 透传ID

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
