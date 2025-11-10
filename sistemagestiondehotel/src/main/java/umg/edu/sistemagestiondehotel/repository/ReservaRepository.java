package umg.edu.sistemagestiondehotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.sistemagestiondehotel.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
