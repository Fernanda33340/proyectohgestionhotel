package umg.edu.sistemagestiondehotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.edu.sistemagestiondehotel.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

