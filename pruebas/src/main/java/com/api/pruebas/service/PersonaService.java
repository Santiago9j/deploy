package com.api.pruebas.service;

import com.api.pruebas.modelo.Persona;
import com.api.pruebas.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona persona = this.findPersona(idOriginal);

        if (persona != null){
            persona.setId(idNueva);
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            persona.setEdad(nuevaEdad);

            this.savePersona(persona);
        }
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }


}
