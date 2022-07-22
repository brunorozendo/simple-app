package com.demo.simpleapp.api.v3.mapper;


import com.demo.simpleapp.api.v3.controller.dto.ClientResponse;
import com.demo.simpleapp.api.v3.dao.models.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {


    @Mapping(target = "customerInfo", source = ".")
    ClientResponse convert(Client source);


}
