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
import com.porfolio.MiPorfolio.models.HabilidadesDurasYBlandasModels;
import com.porfolio.MiPorfolio.services.HabilidadesDurasYBlandasService;
/* */
@RestController
@RequestMapping
public class HabilidadesDurasYBlandasController {
    @Autowired
    HabilidadesDurasYBlandasService habilidadesDurasYBlandasService;

    @GetMapping("/habilidades/mostrar")
    public List<HabilidadesDurasYBlandasModels> obtenerTodasLasHabilidades() {        
        return habilidadesDurasYBlandasService.obtenerTodasLasHabilidades();
    }

    @PostMapping("/habilidades/crear")
    public void crearHabilidades(@RequestBody HabilidadesDurasYBlandasModels habilidades) {
        habilidadesDurasYBlandasService.crearHabilidades(habilidades);        
    }

    @DeleteMapping("/habilidades/borrar/{id}")
    public void borrarHabilidades(@PathVariable int id) {
        habilidadesDurasYBlandasService.borrarHabilidades(id);        
    }
    @PutMapping("/habilidades/actualizar")
    public void actualizarHabilidades(@RequestBody HabilidadesDurasYBlandasModels habilidades){
        this.habilidadesDurasYBlandasService.crearHabilidades(habilidades);
    }
   
}
