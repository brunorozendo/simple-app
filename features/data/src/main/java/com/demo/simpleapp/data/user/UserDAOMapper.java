package com.demo.simpleapp.data.user;


import com.demo.simpleapp.api.v3.dao.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDAOMapper {

    User convert(UserEntity source);
}
