
package com.ClinicaVet.Clinica.service;

import com.ClinicaVet.Clinica.model.Duenio;
import java.util.List;


public interface IDuenioService {
    
     //metodo para traer los Duenioss
    public List <Duenio> getDuenios();
    
    //metodo para crear un Duenios
    public void saveDuenio (Duenio due);
    
    //metodo para borrar un Duenios
    public void deleteDuenio (Long id);
    
    //metodo para editar un Duenios
    public void editDuenio (Duenio due);
    
    // metodo para buscar un Duenio en particular
    public Duenio findDuenio(Long id);

    
    
}
