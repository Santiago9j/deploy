package com.api.pruebas.controller;

import com.api.pruebas.modelo.Persona;
import com.api.pruebas.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/traer")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @GetMapping("/traer/{id}")
    public Persona findPersona(@PathVariable Long id){
        return  personaService.findPersona(id);
    }

    @PostMapping("/crear")
    public String savePersona(@RequestBody Persona persona){
        personaService.savePersona(persona);
        return "La persona " + persona.getNombre() + " " + persona.getApellido() + " fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        personaService.deletePersona(id);
        return "La persona fue eliminado correctamente";
    }

    @PutMapping("/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevoId,
                               @RequestParam(required = false, name = "nombre") String nuevoNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad){
       personaService.editPersona(id_original,nuevoId, nuevoNombre, nuevoApellido, nuevaEdad);


       return  personaService.findPersona(nuevoId);
    }


    @PutMapping("/editar")
    public Persona editPersona(@RequestBody Persona persona){
        personaService.editPersona(persona);
        return personaService.findPersona(persona.getId());
    }
}
