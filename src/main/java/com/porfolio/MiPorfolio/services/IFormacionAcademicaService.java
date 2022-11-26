package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.models.FormacionAcademicaModels;
/* */
public interface IFormacionAcademicaService {
    public ArrayList<FormacionAcademicaModels> obtenerTodaLaFormacion();
    public void crearFormacionAcademica(FormacionAcademicaModels formacion);
    public void borrarFormacionAcademica(int id);
    public FormacionAcademicaModels buscarUnaFormacionAcademica(int id);
}
