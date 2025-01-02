
package com.ClinicaVet.Clinica.service;

import com.ClinicaVet.Clinica.dto.DuenioMascotaDto;
import com.ClinicaVet.Clinica.model.Mascota;
import com.ClinicaVet.Clinica.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MascotaService implements IMascotaService {
    
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
        
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
       
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
        
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
        
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascoRepo.findById(id).orElse(null);
    }

    @Override
        public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        
        
        for (Mascota masco:listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
       
    }

    @Override
    public List<DuenioMascotaDto> getDueMascoDto() {
        
        List<Mascota> listaMascotas = this.getMascotas();
        List<DuenioMascotaDto> listaDueMasco = new ArrayList<>();
        DuenioMascotaDto masco_duenio = new DuenioMascotaDto();
        
        for (Mascota masco : listaMascotas) {
             
            
            System.out.println(masco.getNombre_mascota());
            masco_duenio.setNombre_duenio(masco.getDue().getNombre_duenio());
            masco_duenio.setNombre_mascota(masco.getNombre_mascota());
            masco_duenio.setApellido_duenio(masco.getDue().getApellido_duenio());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());
            
            listaDueMasco.add(masco_duenio);
            masco_duenio = new DuenioMascotaDto();
        }   
        return listaDueMasco;    
                 
    }

   

       
}
