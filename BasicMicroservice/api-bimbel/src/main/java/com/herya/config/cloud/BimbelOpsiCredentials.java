package com.herya.config.cloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vcap.services.database-configuration-spring.credentials")
public class BimbelOpsiCredentials {
    private String jdbcUrlBimbelopsi;
    private String jdbcUsernameBimbelopsi;
    private String jdbcPasswordBimbelopsi;
    private String jdbcDriverClassBimbelopsi;

    public BimbelOpsiCredentials(){

    }

    public BimbelOpsiCredentials(String jdbcUrlBimbelopsi, String jdbcUsernameBimbelopsi, String jdbcPasswordBimbelopsi, String jdbcDriverClassBimbelopsi) {
        this.jdbcUrlBimbelopsi = jdbcUrlBimbelopsi;
        this.jdbcUsernameBimbelopsi = jdbcUsernameBimbelopsi;
        this.jdbcPasswordBimbelopsi = jdbcPasswordBimbelopsi;
        this.jdbcDriverClassBimbelopsi = jdbcDriverClassBimbelopsi;
    }

    public String getJdbcUrlBimbelopsi() {
        return jdbcUrlBimbelopsi;
    }

    public void setJdbcUrlBimbelopsi(String jdbcUrlBimbelopsi) {
        this.jdbcUrlBimbelopsi = jdbcUrlBimbelopsi;
    }

    public String getJdbcUsernameBimbelopsi() {
        return jdbcUsernameBimbelopsi;
    }

    public void setJdbcUsernameBimbelopsi(String jdbcUsernameBimbelopsi) {
        this.jdbcUsernameBimbelopsi = jdbcUsernameBimbelopsi;
    }

    public String getJdbcPasswordBimbelopsi() {
        return jdbcPasswordBimbelopsi;
    }

    public void setJdbcPasswordBimbelopsi(String jdbcPasswordBimbelopsi) {
        this.jdbcPasswordBimbelopsi = jdbcPasswordBimbelopsi;
    }

    public String getJdbcDriverClassBimbelopsi() {
        return jdbcDriverClassBimbelopsi;
    }

    public void setJdbcDriverClassBimbelopsi(String jdbcDriverClassBimbelopsi) {
        this.jdbcDriverClassBimbelopsi = jdbcDriverClassBimbelopsi;
    }
}
