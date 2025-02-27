package lt.techin.Running_Club.dto;

import lt.techin.Running_Club.model.Role;

import java.util.Set;

public record UserResponseDTO(Long id,
                              String username,
                              Set<Role> roles) {
}