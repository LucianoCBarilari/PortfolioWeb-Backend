package com.porfolio.MiPorfolio.Security.Config;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import com.porfolio.MiPorfolio.Security.Services.JpaUserDetailService;
import lombok.var;
/* */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {

    private RSAKey rsaKey;

	private final JpaUserDetailService myUserDetailsServices;

	public WebSecurityConfig(JpaUserDetailService myUserDetailsServices){
		this.myUserDetailsServices = myUserDetailsServices;
	}

	@Bean
    public AuthenticationManager authManager(UserDetailsService userDetailsService) {
        var authProvider = new DaoAuthenticationProvider();
        
        authProvider.setPasswordEncoder(passwordEncoder());
        authProvider.setUserDetailsService(userDetailsService);
        return new ProviderManager(authProvider);
    }

    /*@Bean //crear un usuario en la memoria
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.withUsername("user")
                        .password("{noop}user")
                        .authorities("read")
                        .build()
        );
    }*/

    @Bean
	public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
		
		return httpSecurity
		                   .csrf(csrf -> csrf.disable())
						   .authorizeRequests(auth ->{ auth
							.mvcMatchers(
                                         "/token",
                                         "/acercademi/mostrar",
                                         "/experienciaLaboral/mostrar",
                                         "/formacionacademica/mostrar",
                                         "/habilidades/mostrar",
                                         "/proyectos/mostrar"
                                         )
                            .permitAll()
							.antMatchers(                                
                                         "/acercademi/crear",
                                         "/acercademi/borrar/{id}",
                                         "/acercademi/actualizar",
                                         "/experienciaLaboral/mostrar/{id}",
                                         "/experienciaLaboral/crear",
                                         "/experienciaLaboral/borrar/{id}",
                                         "/experienciaLaboral/actualizar",
                                         "/formacionacademica/crear",
                                         "/formacionacademica/borrar/{id}",
                                         "/formacionacademica/actualizar",
                                         "/habilidades/crear",
                                         "/habilidades/borrar/{id}",
                                         "/habilidades/actualizar",
                                         "/proyectos/crear",
                                         "/proyectos/borrar/{id}",
                                         "/proyectos/actualizar"
                                         )
                            .authenticated();	
						   })
                           .cors(Customizer.withDefaults())
						   .userDetailsService(myUserDetailsServices)
						   .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
						   .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))					   
						   .build();	
	}
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList(""));
        configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
        configuration.setAllowedHeaders(List.of("Content-Type")); //"Authorization" aqui seleccion el tipo de headear
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
    /* */
	@Bean
    public JWKSource<SecurityContext> jwkSource() {
        rsaKey = Jwks.generateRsa();
        JWKSet jwkSet = new JWKSet(rsaKey);
        return (jwkSelector, securityContext) -> jwkSelector.select(jwkSet);
    }
    @Bean
    JwtEncoder jwtEncoder(JWKSource<SecurityContext> jwks) {
        return new NimbusJwtEncoder(jwks);
    }
    @Bean
    JwtDecoder jwtDecoder() throws JOSEException {
         return NimbusJwtDecoder.withPublicKey(rsaKey.toRSAPublicKey()).build();
    }
	@Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }   
}
