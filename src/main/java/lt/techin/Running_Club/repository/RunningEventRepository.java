package lt.techin.Running_Club.repository;


import lt.techin.Running_Club.model.RunningEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunningEventRepository extends JpaRepository<RunningEvent, Long> {
}

