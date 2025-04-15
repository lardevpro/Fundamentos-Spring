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
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director "+informeNuevo.getInforme();
	}

}
