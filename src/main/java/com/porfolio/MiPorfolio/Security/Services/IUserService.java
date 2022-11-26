package com.porfolio.MiPorfolio.Security.Services;
/* */
import java.util.ArrayList;
import com.porfolio.MiPorfolio.Security.Models.UserModel;
/* */
public interface IUserService {
    public ArrayList<UserModel> obtenerUsuarios();
    public void crearUsuario(UserModel usuario);
    public void borrarUsuario(int id);
    public UserModel buscarUnUsuario(int id);    
}
