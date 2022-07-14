package com.demo.simpleapp.data;

import com.demo.simpleapp.api.v3.dao.ClientDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ConfigData {

/*
    @Bean
    public static ClientDAO clientDAO(ClientDAOImpl dao){
        return dao;
    }*/

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertiesData(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new ClassPathResource[ ]{ new ClassPathResource( "data.properties" ) };
        pspc.setLocations( resources );
        pspc.setIgnoreUnresolvablePlaceholders( true );
        return pspc;
    }

}
