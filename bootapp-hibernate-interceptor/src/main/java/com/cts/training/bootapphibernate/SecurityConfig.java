package com.cts.training.bootapphibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// Configuration class to define security Rules
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// WebSecurityConfigurerAdapter : provides 3 methods : configure
	// dependency
	@Autowired
	private DataSource dataSource;
	
	// configure the credentials repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		/********** JDBC Authentication ***************/
		
		// default schema
		auth.jdbcAuthentication().dataSource(dataSource);	
	}
	
	// secure the application : define the accessibility rule
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors()//for cross origin
		.and()
			.csrf().disable()
			.authorizeRequests()
				.antMatchers("/api/**").hasRole("USER")
				.antMatchers("/login").hasRole("USER")
		.and()
			.httpBasic();
	}
}









