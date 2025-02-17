package lt.techin.Running_Club.repository;

import lt.techin.Running_Club.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
  List<Registration> findByRunningEventId(Long runningEventId);
}

