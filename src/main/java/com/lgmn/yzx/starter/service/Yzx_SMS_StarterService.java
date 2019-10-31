package com.lgmn.yzx.starter.service;

import com.alibaba.fastjson.JSONObject;
import com.lgmn.yzx.starter.model.SendSmsEntity;
import com.lgmn.yzx.starter.utils.PostUtil;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;

public class Yzx_SMS_StarterService {

    private final static String SEND_SMS = "https://open.ucpaas.com/ol/sms/sendsms";

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

    public Yzx_SMS_StarterService(String sid, String token, String appid, String templateid) {
        this.sid = sid;
        this.token = token;
        this.appid = appid;
        this.templateid = templateid;
    }

    /**
     * 发送短信
     *
     * @param sendSmsEntity 必传参数 mobile
     * @return
     */
    public JSONObject sendSms(SendSmsEntity sendSmsEntity) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sid", sid);
        jsonObject.put("token", token);
        jsonObject.put("appid", appid);
        jsonObject.put("templateid", templateid);
        jsonObject.put("param", sendSmsEntity.getParam());
        jsonObject.put("mobile", sendSmsEntity.getMobile());
        jsonObject.put("uid", sendSmsEntity.getUid());
        String body = jsonObject.toJSONString();
        String result = PostUtil.postJson(SEND_SMS, body, null);
        return JSONObject.parseObject(result);
    }

}
