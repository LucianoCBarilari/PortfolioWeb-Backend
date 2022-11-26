package com.porfolio.MiPorfolio.models;
import java.sql.Date;
import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name = "ExperienciaLaboral")
public class ExperienciaLaboralModels {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;


    private String empresa;
    private String descripcion;
    private String ubicacion;
    private Date fechaDeInicio;
    private Date fechaDefinalizacion;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }
    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }
    public Date getFechaDefinalizacion() {
        return fechaDefinalizacion;
    }
    public void setFechaDefinalizacion(Date fechaDefinalizacion) {
        this.fechaDefinalizacion = fechaDefinalizacion;
    }
    

}
