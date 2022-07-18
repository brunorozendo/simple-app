package com.demo.simpleapp.data.user;

import com.demo.simpleapp.api.v3.dao.UserDAO;
import com.demo.simpleapp.api.v3.dao.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("userDAO")
@AllArgsConstructor
public class UserDAOImpl implements UserDAO {

    private final UserRepository repository;
    private final UserDAOMapper mapper;

    @Override
    public User findByEmail(String email) {
        Optional<UserEntity> entity = repository.findByEmail(email);
        return entity.map(mapper::convert).orElseGet(() -> null);
    }
}