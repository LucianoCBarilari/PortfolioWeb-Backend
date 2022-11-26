package com.porfolio.MiPorfolio.Security.Repositories;
/* */
import org.springframework.data.repository.CrudRepository;
import com.porfolio.MiPorfolio.Security.Models.UserModel;
import java.util.Optional;
/*
 * Esta interface crea y sobreescribe todo los metodos que van a ser necesarios para solicitar los datos a la base de datos
 */
public interface UserRepository extends CrudRepository <UserModel,Integer>{
    public Optional<UserModel> findByUsername(String user);
}
