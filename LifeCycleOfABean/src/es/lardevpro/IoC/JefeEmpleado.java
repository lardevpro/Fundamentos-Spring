package es.lardevpro.IoC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	//creación de campo tipo informe
	private CreacionInformes informeNuevo;
		
	
	
	@Override
	public String getTareas() {
			return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con modificaciones: " +informeNuevo.getInforme();
	}	
}
