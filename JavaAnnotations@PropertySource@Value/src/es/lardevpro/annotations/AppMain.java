package es.lardevpro.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		
		//leer el class de configuración desde la clase Empleados.class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir un bean al contenedor
		DirectorFinanciero empleado1 = context.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println("Nombre de la empresa: "+empleado1.getNombreEmpresa());
		System.out.println("Email de la empresa: "+empleado1.getEmail());
		
		//cerrar el contexto
		context.close();

	}

}
