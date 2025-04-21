package es.lardevpro.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		//leer el xml de configuración
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir un bean al contenedor
		Empleados empleado1 = context.getBean("ComercialExperimentado", Empleados.class);
		Empleados empleado2 = context.getBean("ComercialExperimentado", Empleados.class);
		
		//por defecto Spring usa el patrón Singleton por lo que utiliza el mismo espacio en memoria para todos los objetos
		if(empleado1 == empleado2) System.out.println("empleado1 y empleado2 apuntan al mismo lugar en memoria");
		else System.out.println("empleado1 y empleado2 NO apuntan al mismo lugar en memoria");
		
		
		//cerrar el contexto
		context.close();

	}

}
