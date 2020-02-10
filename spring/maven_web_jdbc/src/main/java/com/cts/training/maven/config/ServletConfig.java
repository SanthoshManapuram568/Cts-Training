package com.cts.training.maven.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.training.maven")
@PropertySource("classpath:database.properties")
public class ServletConfig {
	
	//configuration for datasource for jdbc
/*
 *one way for jdbc key from database.properties 
 *
	@Value("${jdbc.driver}")
	private String jdbcDriver;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Value("${jdbc.user}")
	private String jdbcUserName;
	
	@Value("${jdbc.password}")
	private String jdbcPassword;
 */
	
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		/* jdbc direct connection
		 * dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/studentdb");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		*/
	/* by using key 	
		dataSource.setDriverClassName(this.jdbcDriver);
		dataSource.setUrl(this.jdbcUrl);
		dataSource.setUsername(this.jdbcUserName);
		dataSource.setPassword(this.jdbcPassword);
		
	*/
		
		//by using env 
		
		dataSource.setDriverClassName(this.env.getProperty("jdbc.driver"));
		dataSource.setUrl(this.env.getProperty("jdbc.url"));
		dataSource.setUsername(this.env.getProperty("jdbc.user"));
		dataSource.setPassword(this.env.getProperty("jdbc.password"));
		
		return dataSource; 
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// inject dependency
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}