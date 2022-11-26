package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.models.ProyectosModels;
import com.porfolio.MiPorfolio.repositories.ProyectosRepository;
/* */
@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    ProyectosRepository proyectosRepository;

    @Override
    public ArrayList<ProyectosModels> obtenerTodosLosProyectos() {
           return (ArrayList<ProyectosModels>) proyectosRepository.findAll();
    }

    @Override
    public void crearProyectos(ProyectosModels proyectos) {
        proyectosRepository.save(proyectos);        
    }

    @Override
    public void borrarProyectos(int id) {
        proyectosRepository.deleteById(id);        
    }

    @Override
    public ProyectosModels buscarUnProyecto(int id) {
            return proyectosRepository.findById(id).orElse(null);
    }
    
}
