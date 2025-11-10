package umg.edu.sistemagestiondehotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.edu.sistemagestiondehotel.model.Reserva;
import umg.edu.sistemagestiondehotel.service.ClienteService;
import umg.edu.sistemagestiondehotel.service.HabitacionService;
import umg.edu.sistemagestiondehotel.service.ReservaService;

@Controller
@RequestMapping("/reservas")
public class ReservaViewController {

    private final ReservaService reservaService;
    private final ClienteService clienteService;
    private final HabitacionService habitacionService;

    public ReservaViewController(ReservaService reservaService, ClienteService clienteService, HabitacionService habitacionService) {
        this.reservaService = reservaService;
        this.clienteService = clienteService;
        this.habitacionService = habitacionService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listar());
        model.addAttribute("clientes", clienteService.listar());
        model.addAttribute("habitaciones", habitacionService.listar());
        model.addAttribute("reserva", new Reserva());
        return "reservas";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Reserva reserva) {
        reservaService.guardar(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("reserva", reservaService.obtenerPorId(id));
        model.addAttribute("reservas", reservaService.listar());
        model.addAttribute("clientes", clienteService.listar());
        model.addAttribute("habitaciones", habitacionService.listar());
        return "reservas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        reservaService.eliminar(id);
        return "redirect:/reservas";
    }
}
