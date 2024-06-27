package com.api.pruebas.modelo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "PERSONAS")
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    //Relación con mascota
    @OneToMany
    private List<Mascota> mascotas;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad, List<Mascota> mascotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascotas = mascotas;
    }
}
