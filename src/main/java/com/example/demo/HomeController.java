package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @GetMapping("/servicios")
    public String servicios(Model model) {
    List<ServiceItem> servicios = new ArrayList<>();
    servicios.add(new ServiceItem("Diseño de Muebles", "Diseño personalizado y fabricación.", "/img/serv1.jpg", "$120.000"));
    servicios.add(new ServiceItem("Restauración", "Reparación y restauración profesional.", "/img/serv2.jpg", "$80.000"));
    servicios.add(new ServiceItem("Envío e Instalación", "Envío a domicilio y montaje.", "/img/serv3.jpg", "$30.000"));
        // añade más si quieres...
    model.addAttribute("servicios", servicios);
    return "servicios";
    }

}
