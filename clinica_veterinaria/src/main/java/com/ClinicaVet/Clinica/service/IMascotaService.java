
package com.ClinicaVet.Clinica.service;

import com.ClinicaVet.Clinica.dto.DuenioMascotaDto;
import com.ClinicaVet.Clinica.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    //metodo para traer las mascotas
    public List <Mascota> getMascotas();
    
    //metodo para crear una mascota
    public void saveMascota (Mascota masco);
    
    //metodo para borrar una mascota
    public void deleteMascota (Long id);
    
    //metodo para editar una mascota
    public void editMascota (Mascota masco);
    
    //metodo para buscar una mascota en particular
    public Mascota findMascota(Long id);
    
    //metodo para traer todas las mascotas de la especie "perro" y raza "caniche"
    public List<Mascota> getCaniches();
    
    //metodo para traer un listado de datos particulares de mascotas y duenios
    public List<DuenioMascotaDto> getDueMascoDto();
    
    //metodo para traer un DTO de una mascdota en particular
   // public List<DuenioMascotaDto> getDtoMascota();
}
