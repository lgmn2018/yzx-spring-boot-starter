package com.lgmn.yzx.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件类
 */
@ConfigurationProperties("yzx.service")
public class YzxStarterServiceProperties {

    private String sid;
    private String token;
    private String appid;
    private String templateid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }
}
