package com.herya.config.data;

import com.herya.config.cloud.BimbelOpsiCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@Profile("cloud")
public class CloudDataSource extends AbstractDataSource {
    @Autowired
    BimbelOpsiCredentials bimbelOpsiCredentials;

    @Bean(name = "soar-bimbelopsi")
    public DataSource bssprodDataSource(){
        return createDataSource(bimbelOpsiCredentials.getJdbcUrlBimbelopsi(), bimbelOpsiCredentials.getJdbcDriverClassBimbelopsi()
        , bimbelOpsiCredentials.getJdbcUsernameBimbelopsi(), bimbelOpsiCredentials.getJdbcPasswordBimbelopsi()
        );
    }
    @Bean(name = "bimbelopsi")
    public JdbcTemplate bssProdJdbcTemplate(@Qualifier("soar-bimbelopsi") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
