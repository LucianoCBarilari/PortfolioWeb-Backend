package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.models.ExperienciaLaboralModels;
import com.porfolio.MiPorfolio.repositories.ExperienciaLaboralRepository;
/* */
@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {

    @Autowired
    ExperienciaLaboralRepository experienciaLaboralRepository;    

@Override
public ArrayList<ExperienciaLaboralModels> obtenerTodaLaExperienciaL() {
   return (ArrayList<ExperienciaLaboralModels>) experienciaLaboralRepository.findAll();
}

@Override
public void crearExperienciaLaboral(ExperienciaLaboralModels experiencia) {
    experienciaLaboralRepository.save(experiencia);
   
}

@Override
public void borrarExperienciaLaboral(int id) {
   experienciaLaboralRepository.deleteById(id);
   
}

@Override
public ExperienciaLaboralModels buscarUnaExperienciaLaboral(int id) {
   return experienciaLaboralRepository.findById(id).orElse(null);
}

}
