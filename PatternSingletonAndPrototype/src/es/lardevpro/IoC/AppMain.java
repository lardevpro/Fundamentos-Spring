package es.lardevpro.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
			
	
		// carga del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("\n----------Resultados del patrón por defecto de Sprign (Singleton)------------");
		
		// petición de beans que usa el patrón por defecto de Spring (Singleton)
		Empleados empleado1 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		Empleados empleado2 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println("Espacio en memoria ocupado de empleado1 : "+empleado1);
		System.out.println("Espacio en memoria ocupado de empleado2 : "+empleado2);
		if(empleado1 == empleado2) System.out.println("Empleado1 y Empleado2 ocupan el mismo espacio de memoria.");
		else System.out.println("Empleado1 y Empleado2 NO usan el mismo espacio en memoria.");
		
		
		System.out.println("\n----------------------Resultados del patrón Prototype------------------------");
		// petición de beans que usa el patrón por defecto de Spring (Singleton)
		Empleados empleado3 = contexto.getBean("miEmpleado",JefeEmpleado.class);
		Empleados empleado4 = contexto.getBean("miEmpleado",JefeEmpleado.class);
		System.out.println("Espacio en memoria ocupado de empleado3 : "+empleado3);
		System.out.println("Espacio en memoria ocupado de empleado4 : "+empleado4);
				
		if(empleado3 == empleado4) System.out.println("Empleado3 y Empleado4 ocupan el mismo espacio de memoria.");
		else System.out.println("Empleado4 y Empleado4 NO usan el mismo espacio en memoria.");
		
		
		contexto.close();
	}
}
