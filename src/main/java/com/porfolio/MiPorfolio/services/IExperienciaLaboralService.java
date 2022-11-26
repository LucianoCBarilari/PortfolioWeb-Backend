package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.models.ExperienciaLaboralModels;
/* */
public interface IExperienciaLaboralService {
    public ArrayList<ExperienciaLaboralModels> obtenerTodaLaExperienciaL();
    public void crearExperienciaLaboral(ExperienciaLaboralModels experiencia);
    public void borrarExperienciaLaboral(int id);
    public ExperienciaLaboralModels buscarUnaExperienciaLaboral(int id);
}