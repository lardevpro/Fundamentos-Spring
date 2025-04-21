package es.lardevpro.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		//leer el class de configuración desde la clase Empleados.class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir un bean al contenedor
		Empleados empleado1 = context.getBean("ComercialExperimentado", Empleados.class);
		Empleados empleado2 = context.getBean("ComercialExperimentado", Empleados.class);
		
		//por defecto Spring usa el patrón Singleton por lo que utiliza el mismo espacio en memoria para todos los objetos
		//en este caso he puesto la etiqueta @Scope("prototype") para que haga diferentes instancias
		//para hacer pruebas puedes quitar la anotación @Scope("prototype") de la clase ComercialExperimentado
		if(empleado1 == empleado2) System.out.println("empleado1 y empleado2 apuntan al mismo lugar en memoria");
		else System.out.println("empleado1 y empleado2 NO apuntan al mismo lugar en memoria");
		
		
		//cerrar el contexto
		context.close();

	}

}
