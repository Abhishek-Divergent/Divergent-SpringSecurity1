package com.divergentsl.security1.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity
public class EmployeeSecurity extends WebSecurityConfigurerAdapter {

	
//	@Bean
//	public UserDetailsService userDetailsService(DataSource dataSource) {
//		return new JdbcUserDetailsManager(dataSource);
//	}

	// Overriding password encoder

	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	
	
	
	
	
//	@Autowired
//	UserDetailsService detailsService;
//
//	@Bean
//	AuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//		daoAuthenticationProvider.setUserDetailsService(detailsService);
//		daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		return daoAuthenticationProvider;
//	}
//		
//	
	
		//	@Bean
		//	public UserDetailsService userDetailsService() {
		//
		//		InMemoryUserDetailsManager detailsManager = new InMemoryUserDetailsManager();
		//
		//		UserDetails details = User.withDefaultPasswordEncoder().username("root").password("root").authorities("read")
		//				.build();
		//		detailsManager.createUser(details);
		//		return detailsManager;
		//
		//	}
		
	
	
	
	
	
	// Authorization configuration
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			// using basic authentication
			http.httpBasic();
			// All the request require authentication because anyRequest() is used
			 http.authorizeRequests().anyRequest().authenticated();

			// Giving access to a particular url/resource to a use with particular authority
			//http.authorizeRequests().antMatchers("/hello").hasAnyAuthority("read");

			// None of the requests need to be authenticated.
		    //http.authorizeRequests().anyRequest().permitAll();

		}

	
}