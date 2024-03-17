package com.privat.repository;

import com.privat.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByFirstNameAndLastName(String username, String lastname);
}
