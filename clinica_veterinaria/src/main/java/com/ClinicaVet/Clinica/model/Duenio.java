
package com.ClinicaVet.Clinica.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_duenio;
    private String dni;
    private String nombre_duenio;
    private String apellido_duenio;
    private String celular;
    @OneToMany(mappedBy = "due", cascade = CascadeType.ALL)
    @JsonManagedReference // Permite serializar mascotas asociadas cuando se obtiene un dueño
    private List<Mascota> listaDeMascotas = new ArrayList<>();

    

    public Duenio() {
    }

    public Duenio(Long id_duenio, String dni, String nombre_duenio, String apellido_duenio, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre_duenio = nombre_duenio;
        this.apellido_duenio = apellido_duenio;
        this.celular = celular;
    }
    
    
    
}
