package es.lardevpro.annotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan("es.lardevpro.annotations") 
@PropertySource("classpath:datosEmpresas.properties") // cargará el archivo de donde recogerá los datos a inyectar
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
