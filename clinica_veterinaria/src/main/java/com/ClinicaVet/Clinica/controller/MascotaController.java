
package com.ClinicaVet.Clinica.controller;

import com.ClinicaVet.Clinica.dto.DuenioMascotaDto;
import com.ClinicaVet.Clinica.model.Mascota;
import com.ClinicaVet.Clinica.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;
    
    //endpoint para traer la lista de mascotas
    @GetMapping("/mascotas/traer")
    public List<Mascota>  traerMascotas() {
        return mascoServ.getMascotas();
        
    }
    
    //endpoint para añadir una nueva mascota
    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);
        return "La mascota se ha creado con exito";
    }
    
    //endpoint para eliminar una mascota
    @DeleteMapping("/mascotas/borrar/{id}")
    public String deleteMascota (@PathVariable Long id){
        mascoServ.deleteMascota(id);
        return "La mascota se ha eliminado con exito";
        
    }
    
    //endpoint para obtener una mascota en particular
    @GetMapping("/mascotas/buscar/{id}")
    public Mascota findMascota (@PathVariable Long id) {
       
        Mascota masco = mascoServ.findMascota(id);
        return masco;
        
    }
    
    //endpoint para modificar una mascota
    @PutMapping("/mascotas/editar")
    public String editMascota(@RequestBody Mascota masco) {
        
        mascoServ.editMascota(masco);
        return "Mascota editada correctamente";
    }
    
    //endpoint para obtener perros de raza caniche
    @GetMapping("/mascotas/traer-caniches")
    public List<Mascota> traerCaniches() {
        return mascoServ.getCaniches();
       
      
    }
    
    //endpoint para obtener lista combinada de datos DTO
    @GetMapping("/mascotas/duenio-mascota")
    public List<DuenioMascotaDto> traerDueMascoDto() {
        return mascoServ.getDueMascoDto();
        
    }
    
    //endpoint para traer un DTO de una mascota especifica
    //@GetMapping("/mascotas/duenio-mascota/{nombre_mascota}")
    //public List <DuenioMascotaDto> traerDtoMascota(@PathVariable String nombre_mascota);
    
}
