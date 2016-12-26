package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication adds the following:
 * 	1. @Configuration -> tags the class as a source of bean 
 * 	definitions for the application context
 * 2. @EnableAutoConfiguration -> tells Spring Boot to start adding beans based on 
 * classpath settings, other beans and various property settings.
 * 3. @EnableWebMvc for Spring MVC app-> Spring Boot adds it automatically when it sees spring-webmvc
 *  on the classpath. This flags the application as a web application and activates key 
 *  Behaviors such as setting up a DispatcherServlet.
 *  4. @ComponentScan -> Tells Spring to look for other components, configurations and 
 *  services in the package allowing it to find controllers.
 * */
@SpringBootApplication
public class SpringWebServiceSampleApplication {

	public static void main(String[] args) {
		// run method to launch an application
		SpringApplication.run(SpringWebServiceSampleApplication.class, args);
	}
}
