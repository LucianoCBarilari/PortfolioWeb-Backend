package com.porfolio.MiPorfolio.models;

import javax.persistence.*;

@Entity
@Table(name = "HabilidadesDurasYBlandas")
public class HabilidadesDurasYBlandasModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;

    private String nombre;
    private int cuantoSabes;
    private String queHabilidadEs;
    
    
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
    public int getCuantoSabes() {
        return cuantoSabes;
    }
    public void setCuantoSabes(int cuantoSabes) {
        this.cuantoSabes = cuantoSabes;
    }
    public String getQueHabilidadEs() {
        return queHabilidadEs;
    }
    public void setQueHabilidadEs(String queHabilidadEs) {
        this.queHabilidadEs = queHabilidadEs;
    }

    
}
