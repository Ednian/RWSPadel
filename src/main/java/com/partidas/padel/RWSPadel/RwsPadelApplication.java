package com.partidas.padel.RWSPadel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableTransactionManagement
@Configuration
@SpringBootApplication(scanBasePackages = "com.partidas.padel.RWSPadel")
//@ComponentScan(basePackages = "com.partidas.padel.RWSPadel") // Agrega el paquete base de la aplicación
@EntityScan(basePackages = "com.partidas.padel.RWSPadel.domain") // Especifica el paquete base de las entidades
@EnableJpaRepositories(basePackages = "com.partidas.padel.RWSPadel.repository") // Especifica el paquete base de los repositorios

//@CrossOrigin(origins = "http://localhost:4200")
public class RwsPadelApplication implements WebMvcConfigurer{

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.partidas.padel.RWSPadel")) // Reemplaza con el paquete de tu aplicación
//                .paths(PathSelectors.any())
//                .build();
//    }
    

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir llamadas desde cualquier origen
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir los métodos HTTP especificados
                .allowedHeaders("*"); // Permitir todos los encabezados
    }



	public static void main(String[] args) {
		SpringApplication.run(RwsPadelApplication.class, args);
	}
        

}
