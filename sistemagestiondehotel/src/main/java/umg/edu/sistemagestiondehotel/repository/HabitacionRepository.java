package umg.edu.sistemagestiondehotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.sistemagestiondehotel.model.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {
}
