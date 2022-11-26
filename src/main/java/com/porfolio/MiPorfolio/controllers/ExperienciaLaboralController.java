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
import com.porfolio.MiPorfolio.models.ExperienciaLaboralModels;
import com.porfolio.MiPorfolio.services.ExperienciaLaboralService;
/* */
@RestController
@RequestMapping
public class ExperienciaLaboralController {
    @Autowired
    ExperienciaLaboralService experienciaLaboralService;

    
    @GetMapping("/experienciaLaboral/mostrar")
    public List<ExperienciaLaboralModels> obtenerExperienciaL(){
        return experienciaLaboralService.obtenerTodaLaExperienciaL();
    }
    @GetMapping("/experienciaLaboral/mostrar/{id}")
    public ExperienciaLaboralModels obtenerUnaExperienciaL(@PathVariable int id){
        return experienciaLaboralService.buscarUnaExperienciaLaboral(id);

    }

    @PostMapping("/experienciaLaboral/crear")
    public void crearExperienciaL(@RequestBody ExperienciaLaboralModels experiencia){
        this.experienciaLaboralService.crearExperienciaLaboral(experiencia);
    }

    @DeleteMapping("/experienciaLaboral/borrar/{id}")
    public void borrarExperienciaL(@PathVariable int id){
        experienciaLaboralService.borrarExperienciaLaboral(id);
    }
    @PutMapping("/experienciaLaboral/actualizar")
    public void actualizarExperienciaL(@RequestBody ExperienciaLaboralModels experiencia){
        this.experienciaLaboralService.crearExperienciaLaboral(experiencia);
    }
    
}
