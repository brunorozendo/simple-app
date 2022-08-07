package com.demo.simpleapp.data;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        name = "spring.config.additional-location",
        value = "classpath:orm.properties"
)
public class ConfigData {

}
