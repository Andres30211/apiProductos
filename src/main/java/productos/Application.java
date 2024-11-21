package productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir todas las rutas
                        .allowedOrigins("http://127.0.0.1:5500", "http://127.0.0.1:5501") // Dominios permitidos
                        .allowedMethods("*") // Métodos HTTP permitidos
                        .allowedHeaders("*") // Encabezados permitidos
                        .allowCredentials(true); // Permitir envío de credenciales (cookies, etc.)
            }
        };
    }

}
