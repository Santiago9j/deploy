package com.api.pruebas.repository;

import com.api.pruebas.modelo.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Long> {
}
