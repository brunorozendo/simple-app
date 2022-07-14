package com.demo.simpleapp.api.v3.mapper;


import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import com.demo.simpleapp.api.v3.dao.models.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientResponse sourceToTarget(Client source);


}
