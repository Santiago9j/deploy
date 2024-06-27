package com.api.pruebas.controller;

import com.api.pruebas.modelo.Mascota;
import com.api.pruebas.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/crear")
    public String saveMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);

        return "La mascota " + mascota.getNombre() + " fue creada";
    }
}
