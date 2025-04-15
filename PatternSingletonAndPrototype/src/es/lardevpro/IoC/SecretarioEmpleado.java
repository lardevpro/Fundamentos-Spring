package es.lardevpro.IoC;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpres;
	
	//inyeccion de dependencias mediante setter
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	

	
	//inyeccion de atributos del objeto
	public void setEmail(String email) {
		this.email = email;
	}

	public void setNombreEmpresa(String nombreEmpres) {
		this.nombreEmpres = nombreEmpres;
	}





	
	//metodos para probar las inyecciones de dependencias
	public String getEmail() {
		return "Email: "+email;
	}
	
	public String getNombreEmpresa() {
		return "Nombre: "+nombreEmpres;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "informe generado por el secretario: "+informeNuevo.getInforme();
	}

}
