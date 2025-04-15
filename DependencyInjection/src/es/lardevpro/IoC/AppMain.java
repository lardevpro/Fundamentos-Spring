package es.lardevpro.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
			
	
		// carga del archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// petición de beans
		SecretarioEmpleado empleado3 = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		// comprobación de las dependencias introducidas por construntur y métodos mediante xml y archivo externo
		System.out.println(empleado3.getTareas());
		
		System.out.println(empleado3.getInforme());
		
		System.out.println(empleado3.getEmail());
		
		System.out.println(empleado3.getNombreEmpresa());
		
		
		contexto.close();
	}
}
