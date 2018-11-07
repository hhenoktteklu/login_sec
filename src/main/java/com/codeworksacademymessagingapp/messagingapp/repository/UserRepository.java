package com.codeworksacademymessagingapp.messagingapp.repository;

import com.codeworksacademymessagingapp.messagingapp.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Integer> {
    Optional<Users> findByFirstName(String username);
}
