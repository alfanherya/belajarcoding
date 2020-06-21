package com.herya.config.cloud;

import com.herya.config.data.AbstractDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@Profile("local")
public class LocalDataSourceConfig extends AbstractDataSource {
    @Bean(name = "soar-bimbelopsi")
    public DataSource bimbelopsiSource(){
        return createDataSource("jdbc:mysql://localhost:3306/bimbelopsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","", "root", "" );
    }
    @Bean(name = "bimbelopsi")
    public JdbcTemplate bimbelopsiJdbcTemplate(@Qualifier("soar-bimbelopsi") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
