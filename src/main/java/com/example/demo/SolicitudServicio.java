package com.example.demo;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class SolicitudServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String servicio;
    private String nombre;
    private String email;
    private String mensaje;
    private LocalDateTime fecha;

    public SolicitudServicio() {}

    public SolicitudServicio(String servicio, String nombre, String email, String mensaje) {
        this.servicio = servicio;
        this.nombre = nombre;
        this.email = email;
        this.mensaje = mensaje;
        this.fecha = LocalDateTime.now();
    }

    // Getters y setters
    public Long getId() { return id; }

    public String getServicio() { return servicio; }
    public void setServicio(String servicio) { this.servicio = servicio; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}
