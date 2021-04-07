package com.tosuncu.springmanagementapp.service;

import com.tosuncu.springmanagementapp.entity.Issue;
import com.tosuncu.springmanagementapp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User save(User user);
    User getById(Long id);
    Page<User> getAllPageable(Pageable pageable);
    User getByUsername(String username);


}
