package com.herya.config.data;

import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

public class AbstractDataSource {
    protected DataSource createDataSource(String url, String driverClass, String userName, String password){
        return DataSourceBuilder.create().username(userName).password(password).url(url).driverClassName(driverClass).build();
    }
}
