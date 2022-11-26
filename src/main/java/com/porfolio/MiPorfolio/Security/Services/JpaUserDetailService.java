package com.porfolio.MiPorfolio.Security.Services;
/* */
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.porfolio.MiPorfolio.Security.Models.SecurityUser;
import com.porfolio.MiPorfolio.Security.Repositories.UserRepository;
/*
 * Esta clase trae de la base de datos los usuarios y sus permisos.
 */
@Service
public class JpaUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    public JpaUserDetailService(UserRepository userRepository){
        this.userRepository =userRepository;
    }

    @Override
	public  UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
				
		return  userRepository
		.findByUsername(user)
		.map(SecurityUser::new)
		.orElseThrow(() -> new UsernameNotFoundException("Username not found: " + user));		
	}
    
}
