package es.lardevpro.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {
	@Autowired//anotación para que haga una busqueda de clase a ineyctar
	@Qualifier("informeFinancieroTrim3")//(primera en minúsculas)especificación de la interfaz a inyectar concretamente (se usa cuando hay al menos dos posibilidades)
	private CreacionInformeFinanciero nuevoInforme;
	
	
	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más";
	}

	@Override
	public String getInforme() {
		
		return nuevoInforme.getInformeFinanciero();
	}

	
	
	

	
}
