package lt.techin.Running_Club.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class RunningEventRequestDTO {
  @NotBlank
  @Size(min = 5, message = "Event name must be at least 5 characters long.")
  private String name;

  @NotNull(message = "Calendar date cannot be null.")
  private LocalDate calendarDate;

  @NotBlank(message = "Location cannot be blank.")
  private String location;

  @NotNull(message = "Max participants cannot be null.")
  private Integer maxParticipants;

}
