package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.models.FormacionAcademicaModels;
import com.porfolio.MiPorfolio.repositories.FormacionAcademicaRepository;
/* */
@Service
public class FormacionAcademicaService implements IFormacionAcademicaService {

    @Autowired
    FormacionAcademicaRepository formacionAcademicaRepository;

    @Override
    public ArrayList<FormacionAcademicaModels> obtenerTodaLaFormacion() {
            return (ArrayList<FormacionAcademicaModels>) formacionAcademicaRepository.findAll();
    }

    @Override
    public void crearFormacionAcademica(FormacionAcademicaModels formacion) {
        formacionAcademicaRepository.save(formacion);        
    }

    @Override
    public void borrarFormacionAcademica(int id) {
        formacionAcademicaRepository.deleteById(id);        
    }

    @Override
    public FormacionAcademicaModels buscarUnaFormacionAcademica(int id) {
           return formacionAcademicaRepository.findById(id).orElse(null);
    }
    
}
