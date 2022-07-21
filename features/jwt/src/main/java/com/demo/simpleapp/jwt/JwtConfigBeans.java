package com.demo.simpleapp.jwt;

import com.demo.simpleapp.business.TokenBO;
import com.demo.simpleapp.api.v3.services.TokenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class JwtConfigBeans {

    @Bean
    public TokenBO tokenBO(TokenService service) {
        return new TokenBO(service);
    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer propertiesJwt(){
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        PropertySources sources = pspc.getAppliedPropertySources();
        //sources.
        Resource[] resources = new ClassPathResource[ ]{ new ClassPathResource("jwt.properties") };
        pspc.setLocations( resources );
        pspc.setIgnoreUnresolvablePlaceholders( true );
        return pspc;
    }
*/
}
