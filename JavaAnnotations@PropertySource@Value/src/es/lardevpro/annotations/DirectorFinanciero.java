package es.lardevpro.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero nuevoInformeFinanciero;
	
	@Value("${email}") //inyectará los valores mediante la etiqueta @Value
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
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

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	
}
