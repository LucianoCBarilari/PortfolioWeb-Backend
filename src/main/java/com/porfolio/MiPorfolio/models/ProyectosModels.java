package com.porfolio.MiPorfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "Proyectos")
public class ProyectosModels {    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 255, nullable = false)
    private String descripcion;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
