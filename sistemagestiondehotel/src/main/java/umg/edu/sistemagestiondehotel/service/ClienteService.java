package umg.edu.sistemagestiondehotel.service;

import org.springframework.stereotype.Service;
import umg.edu.sistemagestiondehotel.model.Cliente;
import umg.edu.sistemagestiondehotel.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // ✅ Listar todos los clientes
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    // ✅ Guardar o actualizar cliente
    public void guardar(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    // ✅ Eliminar cliente
    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
