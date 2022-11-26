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
import com.porfolio.MiPorfolio.models.AcercaDeMiModels;
import com.porfolio.MiPorfolio.services.AcercaDeMiService;
/* */
@RestController
@RequestMapping
public class AcercaDeMiController {
    @Autowired
    AcercaDeMiService acercaDeMiService;

    @GetMapping("/acercademi/mostrar")
    public List<AcercaDeMiModels> obtenerAcercaDMi() {        
        return  acercaDeMiService.obtenerAcercaDeMI() ;
    }

    @PostMapping("/acercademi/crear")
    public void crearAcercaDMi(@RequestBody AcercaDeMiModels acercadm) {
        acercaDeMiService.crearAcercaDeMi(acercadm);   
    }
    @DeleteMapping("/acercademi/borrar/{id}")
    public void borrarAcercaDe(@PathVariable int id){
        acercaDeMiService.borrarAcercaDeMi(id);
    }

    @PutMapping("/acercademi/actualizar")
    public void actualizarExperienciaL(@RequestBody AcercaDeMiModels acercadm){
        this.acercaDeMiService.crearAcercaDeMi(acercadm);
    }    
  
}
