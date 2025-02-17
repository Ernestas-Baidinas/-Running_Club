package lt.techin.Running_Club.dto;

import jakarta.validation.constraints.NotNull;

public class RegistrationRequestDTO {
  @NotNull(message = "User cannot be null.")
  private UserDTO user;

}
