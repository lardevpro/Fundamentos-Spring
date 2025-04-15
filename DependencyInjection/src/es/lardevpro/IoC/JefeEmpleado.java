package es.lardevpro.IoC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	//creación de campo tipo informe
	private CreacionInformes informeNuevo;
		
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
			return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con modificaciones: " +informeNuevo.getInforme();
	}	
}
