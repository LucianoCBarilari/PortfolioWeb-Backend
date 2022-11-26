package com.porfolio.MiPorfolio.Security.Models;
/* */
import java.util.Collection;
import java.util.Arrays;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/* 
 * en esta clase se retornan los permisos de usuarios
*/
public class SecurityUser  implements UserDetails{

    private final UserModel userModels;

//constructor
    public SecurityUser(UserModel userModels){
        this.userModels = userModels;
    }

//implementacion de metodos pertenecientes a userdetails
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {        
        return Arrays.stream(userModels
        .getAccessControl()
        .split(","))
        .map(SimpleGrantedAuthority::new)
        .toList();        
    }
    
    @Override
    public String getPassword() {        
        return userModels.getPassword();
    }
    @Override
    public String getUsername() {        
        return userModels.getUsername();
    }
    @Override
    public boolean isAccountNonExpired() {        
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {        
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {        
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}

