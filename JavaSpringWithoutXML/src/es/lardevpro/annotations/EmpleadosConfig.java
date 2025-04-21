package es.lardevpro.annotations;

import java.security.PublicKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //esta anotación hace que sea esta clase la que configura y no el XML
@ComponentScan("es.lardevpro.annotations") //dice dónde vamos buscar las anotaciones
public class EmpleadosConfig {
	
	//definir el bea para informe financiero DepartamentoFinancieroCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //método que inyectará el Bean al Bean
		
		return new InformeFinancieroCompras();
		
	}
	
	
	//definir el Bean para el DirectorFinanciero e inyectar dependencias y devolverá el Bean
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
