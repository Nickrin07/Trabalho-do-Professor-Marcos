package com.anpede;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableWebMvc	 
public class TadsAnpedeApplication implements WebMvcConfig {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
			}

	public static void main(String[] args) {
		SpringApplication.run(TadsAnpedeApplication.class, args);
	}

}
