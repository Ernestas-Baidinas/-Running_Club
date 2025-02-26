package lt.techin.Running_Club.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lt.techin.Running_Club.model.Role;

import java.util.Set;

public record UserRequestDTO(
        @NotBlank
        @Size(min = 4, message = "Username must be at least 4 characters long and contain onlu lowercase letters and numbers.")
        String username,

        @NotBlank
        @Size(min = 6, message = "Password must be at least 6 characters long.")
        String password,

        @NotBlank
        Set<Role> roles) {
}