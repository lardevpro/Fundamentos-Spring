package es.lardevpro.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		//leer el class de configuración desde la clase Empleados.class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir un bean al contenedor
		Empleados empleado1 = context.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado1.getInforme());
		System.out.println(empleado1.getTareas());
		
		//cerrar el contexto
		context.close();

	}

}
