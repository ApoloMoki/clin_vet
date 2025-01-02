
package com.ClinicaVet.Clinica.service;

import com.ClinicaVet.Clinica.model.Duenio;
import com.ClinicaVet.Clinica.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {
    
    @Autowired
    private IDuenioRepository dueRepo;

    @Override
    public List<Duenio> getDuenios() {
        return dueRepo.findAll();
        
    }

    @Override
    public void saveDuenio(Duenio due) {
        dueRepo.save(due);
        
    }

    @Override
    public void deleteDuenio(Long id) {
        dueRepo.deleteById(id);
        
    }

    @Override
    public void editDuenio(Duenio due) {
        this.saveDuenio(due);
    }

    @Override
    public Duenio findDuenio(Long id) {
        return dueRepo.findById(id).orElse(null);
    }


   
    
}
