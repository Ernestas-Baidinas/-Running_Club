package lt.techin.Running_Club.dto;

import java.time.LocalDate;

public record RunningEventResponseDTO(Long id,
                                      String name,
                                      LocalDate calendarDate,
                                      String location,
                                      Integer maxParticipants) {
}