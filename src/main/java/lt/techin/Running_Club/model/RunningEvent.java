package lt.techin.Running_Club.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "running_events")
public class RunningEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String eventName;

  @OneToMany(mappedBy = "runningEvent")
  private Set<Registration> registrations;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Set<Registration> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(Set<Registration> registrations) {
    this.registrations = registrations;
  }
}