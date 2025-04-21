package es.lardevpro.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //esta anotación hace que sea esta clase la que configura y no el XML
@ComponentScan("es.lardevpro.annotations") //dice dónde vamos buscar las anotaciones
public class EmpleadosConfig {
	
	

}
