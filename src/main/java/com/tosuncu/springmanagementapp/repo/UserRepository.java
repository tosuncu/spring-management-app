package com.tosuncu.springmanagementapp.repo;

import com.tosuncu.springmanagementapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
