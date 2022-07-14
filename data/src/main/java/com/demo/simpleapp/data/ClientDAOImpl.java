package com.demo.simpleapp.data;

import com.demo.simpleapp.api.v3.dao.ClientDAO;
import com.demo.simpleapp.api.v3.dao.models.Client;
import com.demo.simpleapp.data.entities.ClientEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component("clientDAO")
@AllArgsConstructor
public class ClientDAOImpl implements ClientDAO {

    private final ClientRepository repository;

    public ClientEntity finById(ClientEntity student){
        return  new ClientEntity();
    }

    @Override
    public Client findById(Long id) {
        Optional<ClientEntity> entity = repository.findById(id);
        return new Client();
    }
}