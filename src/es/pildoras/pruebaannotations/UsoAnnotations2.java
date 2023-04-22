package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leer el XML de configuración
		// ClassPathXmlApplicationContext contexto = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// leer el class de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		// pedir bean al contenedor
		/*
		 * Empleados antonio = contexto.getBean("comercialExperimentado",
		 * Empleados.class); Empleados lucia =
		 * contexto.getBean("comercialExperimentado", Empleados.class);
		 */
		/*
		 * Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		 * System.out.println(empleado.getTareas());
		 * System.out.println(empleado.getInforme());
		 */
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println(empleado.getEmail());
		System.out.println(empleado.getNombreEmpresa());

		// ¿apuntan al mismo lugar en memoria?
		// System.out.println(antonio == lucia);
		// cerrar el contexto
		contexto.close();
	}

}
