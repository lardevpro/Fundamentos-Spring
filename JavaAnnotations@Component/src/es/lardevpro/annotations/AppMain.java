package es.lardevpro.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		//leer el xml de configuración
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir un bean al contenedor
		Empleados empleado1 = context.getBean("ComercialExperimentado", Empleados.class);
		
		//usar el bean
		System.out.println(empleado1.getTareas());
		
		//cerrar el contexto
		context.close();

	}

}
