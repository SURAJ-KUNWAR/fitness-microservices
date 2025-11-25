package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "Email provided is invalid")
    public String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6  , message = "Password must be at least 6 characters long")
    public String password;

    public String firstName;
    public String lastName;

}
