package com.project.reportes.security.service;


import com.project.reportes.security.dto.UserDto;
import com.project.reportes.security.entities.User;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
