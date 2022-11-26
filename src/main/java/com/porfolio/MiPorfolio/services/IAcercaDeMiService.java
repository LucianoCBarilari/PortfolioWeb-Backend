package com.porfolio.MiPorfolio.services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.models.AcercaDeMiModels;
/* */
public interface IAcercaDeMiService {
    public ArrayList<AcercaDeMiModels> obtenerAcercaDeMI();
    public void crearAcercaDeMi(AcercaDeMiModels acercadm);
    public void borrarAcercaDeMi(int id);    
}
