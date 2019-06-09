package com.carlos.charlylogin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CharlyloginApplication extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(CharlyloginApplication.class);

	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(CharlyloginApplication.class);
	   }
	
	public static void main(String[] args) {
	      
		SpringApplication.run(CharlyloginApplication.class, args);
		
		log.info("this is my oun message info");
	}
	
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from Tomcat";
	}

}
