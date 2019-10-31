package com.lgmn.yzx.starter.autoConfigure;

import com.lgmn.yzx.starter.properties.YzxStarterServiceProperties;
import com.lgmn.yzx.starter.service.Yzx_SMS_StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutoConfigure
 */
@Configuration
@EnableConfigurationProperties(YzxStarterServiceProperties.class)
@ConditionalOnClass(Yzx_SMS_StarterService.class)
@ConditionalOnProperty(prefix = "yzx.service", value = "enabled", matchIfMissing = true)
public class YzxStarterAutoConfigure {

    @Autowired
    private YzxStarterServiceProperties yzxStarterServiceProperties;

    @Bean
    @ConditionalOnMissingBean(Yzx_SMS_StarterService.class)
    Yzx_SMS_StarterService yzx_sms_starterService () {
        return new Yzx_SMS_StarterService(
                yzxStarterServiceProperties.getSid(),
                yzxStarterServiceProperties.getToken(),
                yzxStarterServiceProperties.getAppid(),
                yzxStarterServiceProperties.getTemplateid());
    }

}
