package br.com.marcosxavierdev.myfood.di.notification;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value();

}

/*	Anotação criada para ser usada na desambiguação de beans, tendo a missão de configurar o valor que representará cada bean.
 * 	(esses valores foram criados na enum NivelUrgencia)
 *
 * 	<AC> annotation de classe
 *	
 *	<AC> @Qualifier - indica ao spring que essa classe é uma bean com qualificação (que terá prioridade caso um requisito seja atendido)
 * 
 * 	<AC> @Retention(RetentionPolicy.RUNTIME) - indica que essa qualified bean foi resolvida via criação de anotação. 
 * 
 */



