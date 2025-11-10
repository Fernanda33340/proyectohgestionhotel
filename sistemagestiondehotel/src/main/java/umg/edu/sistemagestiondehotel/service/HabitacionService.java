package umg.edu.sistemagestiondehotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.sistemagestiondehotel.model.Habitacion;
import umg.edu.sistemagestiondehotel.repository.HabitacionRepository;

import java.util.List;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository repo;

    // Listar todas las habitaciones
    public List<Habitacion> listar() {
        return repo.findAll();
    }

    // Buscar habitación por ID
    public Habitacion obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Guardar o actualizar habitación
    public Habitacion guardar(Habitacion habitacion) {
        return repo.save(habitacion);
    }

    // Eliminar habitación
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
