
package com.ClinicaVet.Clinica.repository;

import com.ClinicaVet.Clinica.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long> {
    
}
