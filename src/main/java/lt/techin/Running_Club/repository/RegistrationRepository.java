package lt.techin.Running_Club.repository;

import lt.techin.Running_Club.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
  List<Registration> findByUserId(Long userId);
}