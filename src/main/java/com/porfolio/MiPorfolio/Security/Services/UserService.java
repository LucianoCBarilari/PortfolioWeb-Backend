package com.porfolio.MiPorfolio.Security.Services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.Security.Models.UserModel;
import com.porfolio.MiPorfolio.Security.Repositories.UserRepository;
/*
 * 
 */
public class UserService  implements IUserService{
    
    private final UserRepository userRepository;
//constructor
    private UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
//metodos
    @Override
    public ArrayList<UserModel> obtenerUsuarios() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    @Override
    public void crearUsuario(UserModel usuario) {
        userRepository.save(usuario);        
    }
    @Override
    public void borrarUsuario(int id) {
        userRepository.deleteById(id);        
    }
    @Override
    public UserModel buscarUnUsuario(int id) {       
        return userRepository.findById(id).orElse(null);
    }
    
}
