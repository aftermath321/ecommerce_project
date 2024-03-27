package com.ecp.ecommerceproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.ecp.ecommerceproject.services.UserDetailService;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableConfigurationProperties
@EnableWebSecurity
@EntityScan(basePackages = {"com.ecp.ecommerceproject.model"})
public class EcommerceProjectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceProjectApplication.class, args);
    }


	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
			.authorizeHttpRequests(requests -> {
				requests.requestMatchers("/*", "/product/*", "/user/*").permitAll();
				requests.requestMatchers("/admin/*").hasRole("ADMIN");
				requests.requestMatchers("/checkout/*", "/panel/*").hasRole("USER");
				requests.anyRequest().authenticated();
			})
			.formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
			.build();
				
				
				
		
	}
	@Autowired
    private UserDetailService userDetailService;

	@Bean
    public UserDetailsService userDetailsService() {
        return userDetailService;
    }

	@Bean
	public AuthenticationProvider authenticationProvider(){
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
