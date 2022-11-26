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
import com.porfolio.MiPorfolio.models.FormacionAcademicaModels;
import com.porfolio.MiPorfolio.services.FormacionAcademicaService;
/* */
@RestController
@RequestMapping
public class FormacionAcademicaController {
    @Autowired
    FormacionAcademicaService formacionAcademicaService;

    @GetMapping("/formacionacademica/mostrar")
    public List<FormacionAcademicaModels> obtenerTodaLaFormacion() {
            return formacionAcademicaService.obtenerTodaLaFormacion();
    }

    @PostMapping("/formacionacademica/crear")
    public void crearFormacionAcademica(@RequestBody FormacionAcademicaModels formacion) {
        formacionAcademicaService.crearFormacionAcademica(formacion);        
    }

    @DeleteMapping("/formacionacademica/borrar/{id}")
    public void borrarFormacionAcademica(@PathVariable int id) {
        formacionAcademicaService.borrarFormacionAcademica(id);        
    }
    @PutMapping("/formacionacademica/actualizar")
    public void actualizarformacionAcademica(@RequestBody FormacionAcademicaModels formacion){
        formacionAcademicaService.crearFormacionAcademica(formacion);
    }    
    
}
