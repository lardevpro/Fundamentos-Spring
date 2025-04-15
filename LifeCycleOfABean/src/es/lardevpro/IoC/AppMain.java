package es.lardevpro.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
			
	
		// carga del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// petición de beans que usa el patrón por defecto de Spring (Singleton)
		Empleados empleado1 = contexto.getBean("miSecretarioEmpleado",DirectorEmpleado.class);
		
		//impresión que se muestra entre init y destroy
		System.out.println(empleado1.getInforme());
		
		contexto.close();
	}
}
