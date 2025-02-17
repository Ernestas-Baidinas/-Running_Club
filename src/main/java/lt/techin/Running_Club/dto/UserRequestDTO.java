package lt.techin.Running_Club.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class UserRequestDTO {
  @NotBlank
  @Size(min = 4, message = "Username must be at least 4 characters long and contain only lowercase letters and numbers.")
  private String username;

  @NotBlank
  @Size(min = 6, message = "Password must be at least 6 characters long.")
  private String password;

  @NotBlank
  private Set<RoleDTO> roles;

}