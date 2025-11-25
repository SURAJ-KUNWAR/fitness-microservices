package com.fitness.userservice.dto;

import com.fitness.userservice.model.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public class UserResponse {
    private String id;
    private String email;
    private String firstName;
    private String lastname;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
