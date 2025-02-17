package lt.techin.Running_Club.model;

import jakarta.persistence.*;
import jakarta.servlet.Registration;

import java.util.Set;

@Entity
@Table(name = "running_events")
public class RunningEvent {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(name = "calendar_date", nullable = false)
  private java.sql.Date calendarDate;

  @Column(nullable = false)
  private String location;

  @Column(name = "max_participants")
  private Integer maxParticipants;

  @OneToMany(mappedBy = "runningEvent")
  private Set<Registration> registrations;

}
