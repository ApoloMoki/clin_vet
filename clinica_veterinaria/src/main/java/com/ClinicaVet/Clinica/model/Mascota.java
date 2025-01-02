
package com.ClinicaVet.Clinica.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String color;
    
    @ManyToOne
    @JoinColumn(name="id_duenio", referencedColumnName="id_duenio")
    //@JsonIgnore //importante agregar para evitar errores de formato en la response
    @JsonBackReference
    private Duenio due;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre_mascota, String especie, String raza, String color) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
    
    


}
