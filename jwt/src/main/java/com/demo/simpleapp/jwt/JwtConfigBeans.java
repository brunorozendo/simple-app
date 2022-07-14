package com.demo.simpleapp.jwt;

import com.demo.simpleapp.business.TokenBO;
import com.demo.simpleapp.api.v3.business.TokenService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class JwtConfigBeans {

    @Bean
    public TokenBO tokenBO(TokenService service) {
        return new TokenBO(service);
    }

}
