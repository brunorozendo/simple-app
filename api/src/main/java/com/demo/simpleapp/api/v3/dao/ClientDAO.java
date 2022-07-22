package com.demo.simpleapp.api.v3.dao;

import com.demo.simpleapp.api.v3.dao.models.Client;

public interface ClientDAO {

    Client findById(Long id);

}
