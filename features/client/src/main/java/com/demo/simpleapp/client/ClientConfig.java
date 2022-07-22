package com.demo.simpleapp.client;

import com.demo.simpleapp.api.v3.dao.ClientDAO;
import com.demo.simpleapp.api.v3.mapper.ClientMapper;
import com.demo.simpleapp.business.ClientBO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClientConfig {

    @Bean
    public ClientBO clientBO(ClientDAO dao, ClientMapper mapper) {
        return new ClientBO(dao, mapper);
    }

}
