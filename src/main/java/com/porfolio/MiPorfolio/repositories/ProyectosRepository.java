package com.porfolio.MiPorfolio.repositories;
/*------- */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.porfolio.MiPorfolio.models.ProyectosModels;
/*------ */
@Repository
public interface ProyectosRepository extends CrudRepository <ProyectosModels, Integer> {
    
}
