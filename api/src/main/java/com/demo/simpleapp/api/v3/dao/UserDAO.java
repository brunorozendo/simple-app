package com.demo.simpleapp.api.v3.dao;

import com.demo.simpleapp.api.v3.dao.models.User;

public interface UserDAO {

    User findByEmail(String email);

}
