package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//pedir bean al contenedor
		Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		//usar el bean
		System.out.println(antonio.getInforme());

		System.out.println(antonio.getTareas());
		//cerrar el contexto
		contexto.close();
	}

}
