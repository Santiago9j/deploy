package com.api.pruebas.service;

import com.api.pruebas.modelo.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();

    public Persona findPersona(Long id);

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    //Editar


    // 1 Forma
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);

    // 2 Forma

    public void editPersona(Persona persona);
}
