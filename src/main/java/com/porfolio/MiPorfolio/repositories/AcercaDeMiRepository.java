package com.porfolio.MiPorfolio.repositories;
/*------- */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.porfolio.MiPorfolio.models.AcercaDeMiModels;
/*------- */
@Repository
public interface AcercaDeMiRepository extends CrudRepository <AcercaDeMiModels, Integer> {
    
}
