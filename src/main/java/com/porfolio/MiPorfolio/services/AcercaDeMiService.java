package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.models.AcercaDeMiModels;
import com.porfolio.MiPorfolio.repositories.AcercaDeMiRepository;
/* */
@Service
public class AcercaDeMiService  implements IAcercaDeMiService{
    @Autowired
    AcercaDeMiRepository acercaDeMiRepository;
    
    @Override
    public ArrayList<AcercaDeMiModels> obtenerAcercaDeMI() {        
        return (ArrayList<AcercaDeMiModels>) acercaDeMiRepository.findAll() ;
    }

    @Override
    public void crearAcercaDeMi(AcercaDeMiModels acercadm) {
        acercaDeMiRepository.save(acercadm);        
    }

    @Override
    public void borrarAcercaDeMi(int id) {
        acercaDeMiRepository.deleteById(id);        
    }    
}
