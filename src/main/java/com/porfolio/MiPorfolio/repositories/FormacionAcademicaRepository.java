package com.porfolio.MiPorfolio.repositories;
/*------- */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.porfolio.MiPorfolio.models.FormacionAcademicaModels;
/*------- */
@Repository
public interface FormacionAcademicaRepository extends CrudRepository <FormacionAcademicaModels, Integer>{
    
}
