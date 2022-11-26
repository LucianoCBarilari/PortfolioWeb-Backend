package com.porfolio.MiPorfolio;
/* */
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.porfolio.MiPorfolio.Security.Config.RsaKeyProperties;
import com.porfolio.MiPorfolio.Security.Models.UserModel;
import com.porfolio.MiPorfolio.Security.Repositories.UserRepository;
/* */
@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
@ComponentScan
public class MiPorfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPorfolioApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(UserRepository users, PasswordEncoder encoder) {
		return args -> {
			users.save(new UserModel(456123,"user",encoder.encode("user"),"admin"));
		};
	}

}
