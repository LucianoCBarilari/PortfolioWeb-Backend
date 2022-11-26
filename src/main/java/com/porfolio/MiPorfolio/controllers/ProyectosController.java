package com.porfolio.MiPorfolio.controllers;
/* */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.porfolio.MiPorfolio.models.ProyectosModels;
import com.porfolio.MiPorfolio.services.ProyectosService;
/* */
@RestController
@RequestMapping
public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;

    @GetMapping("/proyectos/mostrar")
    public List<ProyectosModels> obtenerTodosLosProyectos() {
           return proyectosService.obtenerTodosLosProyectos();
    }

    @PostMapping("/proyectos/crear")
    public void crearProyectos(@RequestBody ProyectosModels proyectos) {
        proyectosService.crearProyectos(proyectos);        
    }

    @DeleteMapping("/proyectos/borrar/{id}")
    public void borrarProyectos(@PathVariable int id) {
        proyectosService.borrarProyectos(id);        
    }
    @PutMapping("/proyectos/actualizar")
    public void actualizarProyectos(@RequestBody ProyectosModels proyectos){
        this.proyectosService.crearProyectos(proyectos);
    }
}
