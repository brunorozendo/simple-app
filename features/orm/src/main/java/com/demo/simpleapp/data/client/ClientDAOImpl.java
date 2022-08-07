package com.demo.simpleapp.data.client;

import com.demo.simpleapp.api.v3.dao.ClientDAO;
import com.demo.simpleapp.api.v3.dao.models.Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("clientDAO")
@AllArgsConstructor
public class ClientDAOImpl implements ClientDAO {

    private final ClientRepository repository;

    @Override
    public Optional<Client> findById(Long id) {
        Optional<ClientEntity> entity = repository.findById(id);
        return Optional.of(new Client());
    }
}