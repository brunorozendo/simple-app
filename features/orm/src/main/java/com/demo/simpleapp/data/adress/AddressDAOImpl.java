package com.demo.simpleapp.data.adress;

import com.demo.simpleapp.api.v3.dao.AddressDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component("addressDAO")
@AllArgsConstructor
public class AddressDAOImpl implements AddressDAO {

    private final AddressRepository repository;




}