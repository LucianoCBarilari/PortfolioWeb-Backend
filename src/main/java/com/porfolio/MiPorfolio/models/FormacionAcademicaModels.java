package com.porfolio.MiPorfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "FormacionAcademica")
public class FormacionAcademicaModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;

    @Column(length = 50, nullable = false)
    private String institucion;

    @Column(length = 255)
    private String descripcion;

    @Column(length = 50)
    private String ubicacion;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }    
}
