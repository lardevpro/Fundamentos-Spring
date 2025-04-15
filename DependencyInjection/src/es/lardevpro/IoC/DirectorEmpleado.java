package es.lardevpro.IoC;

public class DirectorEmpleado implements Empleados {

	
	//creación de campo tipo informe
	private CreacionInformes informeNuevo;
	
	
	//creación del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
		
	}
		
	
	
	
	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el director "+informeNuevo.getInforme();
	}

}
