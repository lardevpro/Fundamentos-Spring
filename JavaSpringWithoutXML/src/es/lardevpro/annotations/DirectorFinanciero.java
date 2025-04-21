package es.lardevpro.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero nuevoInformeFinanciero;
	
	@Autowired
	public DirectorFinanciero(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero = nuevoInformeFinanciero;
	}

	@Override
	public String getTareas() {
		
		return "Gestión de la parte de financiación de la empresa";
	}

	@Override
	public String getInforme() {
		
		return nuevoInformeFinanciero.getInformeFinanciero();
	}

	
}
