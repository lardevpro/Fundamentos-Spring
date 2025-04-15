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

	//método init encargado de ejecutar tareas antes de utilizar el bean (el nombre del método puede ser otro)
	public void init() {
		System.out.println("*En este punto se ejecutan las tareas ANTES de tener el bean*");
	}
	
	//método init encargado de ejecutar tareas después de utilizar el bean (el nombre del método puede ser otro)
	public void destroy() {
		System.out.println("*En este punto se ejecutan las tareas DESPUÉS de utilizar el bean*");	
	}
	
}
