package es.pildoras.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ComercialExperimentado")
@Component
@Scope("singleton")
public class ComercialExperimentado implements Empleados {
	//Ejecución de código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		//System.out.println("Ejecutado tras creación de Bean");
	}
	@PreDestroy
	//Ejecución de código después de apagado contenedor spring
	public void ejecutaAntesDestruccion() {
		//System.out.println("Ejecutado antes de la destrucción");
	}
	@Autowired
	@Qualifier("informeFinancieroTrim4") //bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
	
	/*
	//Error video 18
	public ComercialExperimentado(){
	
	}
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/
	/*
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return  nuevoInforme.getInformeFinanciero();
	}

}
