package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.models.HabilidadesDurasYBlandasModels;
/* */
public interface IHabilidadesDurasYBlandasServices {
    public ArrayList<HabilidadesDurasYBlandasModels> obtenerTodasLasHabilidades();
    public void crearHabilidades(HabilidadesDurasYBlandasModels habilidades);
    public void borrarHabilidades(int id);
    public HabilidadesDurasYBlandasModels buscarUnaHabilidad(int id);  
}
