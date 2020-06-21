package com.herya.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vcap.services.api-bimbel.service.credentials")
public class AppProperties {
    private String APP_NAME;

    public  String getAPP_NAME(){
        return APP_NAME;
    }

    public void setAPP_NAME(String APP_NAME) {
        this.APP_NAME = APP_NAME;
    }
}
