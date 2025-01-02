
package com.ClinicaVet.Clinica.controller;

import com.ClinicaVet.Clinica.model.Duenio;
import com.ClinicaVet.Clinica.service.IDuenioService;
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
public class DuenioController {
    
    @Autowired
    private IDuenioService dueServ;
    
    //endpoint para traer la lista de Duenios
    @GetMapping("/duenios/traer")
    public List<Duenio>  traerDuenios() {
        return dueServ.getDuenios();
        
    }
    
    //endpoint para añadir un nuevo Duenios
    @PostMapping("/duenios/crear")
    public String saveDuenio (@RequestBody Duenio due) {
        dueServ.saveDuenio(due);
        return "El duenio se ha creado con exito";
    }
    
    //endpoint para eliminar un Duenios
    @DeleteMapping("/duenios/borrar/{id}")
    public String deleteDuenio (@PathVariable Long id){
        dueServ.deleteDuenio(id);
        return "El duenio se ha eliminado con exito";
        
    }
    
    //endpoint para obtener un Duenio en particular
    @GetMapping("/duenios/buscar/{id}")
    public Duenio findDuenio (@PathVariable Long id) {
       
        Duenio due = dueServ.findDuenio(id);
        return due;
        
    }
    
    //endpoint para modificar un Duenios
    @PutMapping("/duenios/editar")
    public String editDuenio(@RequestBody Duenio due) {
        
        dueServ.editDuenio(due);
        return "Duenio editado correctamente";
    }
    
    
    
}
