package umg.edu.sistemagestiondehotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReporteViewController {

    @GetMapping("/reportes")
    public String reportes() {
        return "reportes";
    }
}
