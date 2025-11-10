package umg.edu.sistemagestiondehotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.edu.sistemagestiondehotel.service.HabitacionService;
import umg.edu.sistemagestiondehotel.model.Habitacion;

@Controller
@RequestMapping("/habitaciones")
public class HabitacionViewController {

    private final HabitacionService habitacionService;

    public HabitacionViewController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("habitaciones", habitacionService.listar());
        model.addAttribute("habitacion", new Habitacion());
        return "habitaciones";
    }
}
