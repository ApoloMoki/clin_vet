
package com.ClinicaVet.Clinica.repository;

import com.ClinicaVet.Clinica.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    
}
