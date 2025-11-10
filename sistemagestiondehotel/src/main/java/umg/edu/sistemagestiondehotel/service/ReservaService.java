package umg.edu.sistemagestiondehotel.service;

import org.springframework.stereotype.Service;
import umg.edu.sistemagestiondehotel.model.Reserva;
import umg.edu.sistemagestiondehotel.repository.ReservaRepository;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    public void guardar(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    public Reserva obtenerPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        reservaRepository.deleteById(id);
    }
}
