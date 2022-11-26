package com.porfolio.MiPorfolio.repositories;
/*------- */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.porfolio.MiPorfolio.models.HabilidadesDurasYBlandasModels;
/*------ */
@Repository
public interface HabilidadesDurasYBlandasRepository extends CrudRepository <HabilidadesDurasYBlandasModels, Integer> {
    
}
