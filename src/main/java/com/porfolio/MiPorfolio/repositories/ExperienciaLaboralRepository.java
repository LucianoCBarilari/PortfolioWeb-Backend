package com.porfolio.MiPorfolio.repositories;
/*------- */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.porfolio.MiPorfolio.models.ExperienciaLaboralModels;
/*------- */
/*puedo usar crud repository o jpa repository */
@Repository
public interface ExperienciaLaboralRepository extends CrudRepository <ExperienciaLaboralModels, Integer>{
    
}
