package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.models.ProyectosModels;
/* */
public interface IProyectosService {
    public ArrayList<ProyectosModels> obtenerTodosLosProyectos();
    public void crearProyectos(ProyectosModels proyectos);
    public void borrarProyectos(int id);
    public ProyectosModels buscarUnProyecto(int id);    
}
