package umg.edu.sistemagestiondehotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.edu.sistemagestiondehotel.model.Cliente;
import umg.edu.sistemagestiondehotel.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteViewController {

    private final ClienteService clienteService;

    public ClienteViewController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Muestra la lista de clientes
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("clientes", clienteService.listar());
        model.addAttribute("cliente", new Cliente());
        return "clientes";
    }

    // Guarda un nuevo cliente
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cliente cliente) {
        clienteService.guardar(cliente);
        return "redirect:/clientes";
    }

    //Eliminar cliente por ID
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        clienteService.eliminar(id);
        return "redirect:/clientes";
    }
}
