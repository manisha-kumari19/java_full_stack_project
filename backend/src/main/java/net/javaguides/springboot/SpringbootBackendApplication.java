package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableMultipart
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		System.out.println("Application in running");
	}

	
//	 
//	 @Bean
//	    public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurer() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/**") // Allow all endpoints to have CORS enabled
//	                        .allowedOrigins("http://localhost:8080") // Specify the allowed origin (your frontend application URL)
//	                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Specify allowed HTTP methods
//	            }
//	        };
//}
}
