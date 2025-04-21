package es.lardevpro.annotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más";
	}

	@Override
	public String getInforme() {
		
		return "Esto es un informe generado por el comercial";
	}

}
