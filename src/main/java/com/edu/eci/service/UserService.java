package com.edu.eci.service;

import com.edu.eci.repository.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    Optional<User> getUserByEmail(String email);
    void deleteUser(String id);

    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
