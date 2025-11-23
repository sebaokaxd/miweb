package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SolicitudController {

    @Autowired
    private SolicitudServicioRepository repo;

    // Formulario con el nombre del servicio seleccionado
    @GetMapping("/solicitar")
    public String solicitar(@RequestParam String servicio, Model model) {
        model.addAttribute("servicio", servicio);
        return "solicitar";
    }

    // Procesa el formulario
    @PostMapping("/solicitar")
    public String enviarSolicitud(
            @RequestParam String servicio,
            @RequestParam String nombre,
            @RequestParam String email,
            @RequestParam String mensaje,
            Model model) {

        // Guardar en BD
        SolicitudServicio s = new SolicitudServicio(servicio, nombre, email, mensaje);
        repo.save(s);

        model.addAttribute("servicio", servicio);
        return "gracias";
    }
}

