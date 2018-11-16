/**
 * 
 */
package es.indra.demoblog.aspects;

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
	@Before("execution(* es.indra.demoblog.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {
		// Advice / Consejo
		System.out.println("Dentro del aspecto para: " + join);
	}
}
