package lt.techin.Running_Club.dto;

import jakarta.validation.constraints.NotNull;

@NotNull(message = "User cannot be null.")
public record RegistrationRequestDTO(UserDTO user) {
}