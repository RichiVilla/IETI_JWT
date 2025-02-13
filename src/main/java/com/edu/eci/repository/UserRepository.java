package com.edu.eci.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email); // 👈 Esto debe coincidir con el nombre del campo en la BD
}
