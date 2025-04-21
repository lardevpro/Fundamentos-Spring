package es.lardevpro.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	private CreacionInformeFinanciero nuevoInforme;
	
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		
		return "Vender, vender y vender más";
	}

	@Override
	public String getInforme() {
		
		return nuevoInforme.getInformeFinanciero();
	}

	
	
	

	
}
