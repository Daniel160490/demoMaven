/**
 * 
 */
package es.indra.apicarro.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * @author Daniel
 *
 */
@Aspect
@Configuration
public class LogServiceAspect {

	/*
	 * Imprime un log en todas las clases incluidas en el package Service.impl El
	 * asterisco antes del paquete nos dice que da igual el tipo de retorno
	 */
	@Before("execution(* es.indra.apicarro.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {
		// Advice / Consejo
		System.out.println("Dentro del aspecto para: " + join);
	}

	/*
	 * Metodo que calcula el tiempo de ejecucion de una peticion Rest
	 */
	/*
	 * @Around("annotation(* es.indra.apicarro.aspects.anotaciones.MedidorDeTiempo)"
	 * ) public void around(ProceedingJoinPoint joinPoint) throws Throwable { long
	 * inicio = System.currentTimeMillis(); joinPoint.proceed(); long tiempo =
	 * System.currentTimeMillis() - inicio;
	 * System.out.println("Tiempo de ejecucion: " + tiempo + " ms"); }
	 */
}
