package com.api.pruebas.service;

import com.api.pruebas.modelo.Mascota;
import com.api.pruebas.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevaEspecia, String nuevaRaza, String nuevoColor) {
        Mascota mascota = this.findMascota(idOriginal);

        if (mascota != null){
            mascota.setId_mascota(idNueva);
            mascota.setNombre(nuevoNombre);
            mascota.setEspecie(nuevaEspecia);
            mascota.setRaza(nuevaRaza);
            mascota.setColor(nuevoColor);


            this.saveMascota(mascota);
        }
    }
}
