package lt.techin.Running_Club.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "registrations")
public class Registration {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "running_event_id", nullable = false)
  private RunningEvent runningEvent;

  @Column(name = "registration_date", nullable = false)
  private Date registrationDate;

}

