package com.demo.simpleapp.data.adress;

import com.demo.simpleapp.data.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends  JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

}