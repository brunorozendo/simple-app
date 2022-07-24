package com.demo.simpleapp.api.v3.dao;

import com.demo.simpleapp.api.v3.dao.models.Client;

import java.util.Optional;

public interface ClientDAO {

    Optional<Client> findById(Long id);

}
