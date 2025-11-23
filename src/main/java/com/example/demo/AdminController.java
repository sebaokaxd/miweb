package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private SolicitudServicioRepository repo;

    // Lista todas las solicitudes
    @GetMapping("/admin/solicitudes")
    public String verSolicitudes(Model model) {
        model.addAttribute("solicitudes", repo.findAll());
        return "admin-solicitudes"; // Thymeleaf HTML
    }
}

