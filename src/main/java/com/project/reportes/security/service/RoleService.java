package com.project.reportes.security.service;


import com.project.reportes.security.entities.Role;

public interface RoleService {
    Role findByName(String name);
}
