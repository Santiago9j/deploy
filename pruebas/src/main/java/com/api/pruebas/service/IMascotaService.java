package com.api.pruebas.service;

import com.api.pruebas.modelo.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public Mascota findMascota(Long id);

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long id);

    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevaEspecia, String nuevaRaza, String nuevoColor);

}
