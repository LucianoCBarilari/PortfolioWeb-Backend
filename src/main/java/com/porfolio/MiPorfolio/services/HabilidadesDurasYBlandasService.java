package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.models.HabilidadesDurasYBlandasModels;
import com.porfolio.MiPorfolio.repositories.HabilidadesDurasYBlandasRepository;
/* */
@Service
public class HabilidadesDurasYBlandasService implements IHabilidadesDurasYBlandasServices {

    @Autowired
    HabilidadesDurasYBlandasRepository habilidadesDurasYBlandasRepository;

    @Override
    public ArrayList<HabilidadesDurasYBlandasModels> obtenerTodasLasHabilidades() {        
        return (ArrayList<HabilidadesDurasYBlandasModels>) habilidadesDurasYBlandasRepository.findAll();
    }

    @Override
    public void crearHabilidades(HabilidadesDurasYBlandasModels habilidades) {
        habilidadesDurasYBlandasRepository.save(habilidades);        
    }

    @Override
    public void borrarHabilidades(int id) {
        habilidadesDurasYBlandasRepository.deleteById(id);        
    }

    @Override
    public HabilidadesDurasYBlandasModels buscarUnaHabilidad(int id) {
           return habilidadesDurasYBlandasRepository.findById(id).orElse(null);
    }
    
}
