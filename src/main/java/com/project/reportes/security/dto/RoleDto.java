package com.project.reportes.security.dto;

import com.project.reportes.security.entities.Role;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Role} entity
 */
@Data
public class RoleDto implements Serializable {
    private final long id;
    private final String name;
    private final String description;
}