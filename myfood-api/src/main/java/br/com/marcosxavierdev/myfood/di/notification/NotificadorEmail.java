package br.com.marcosxavierdev.myfood.di.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

@Profile("production")
@TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
//	@Value("${notificador.email.host-servidor}")
//	private String host;
	
//	@Value("${notificador.email.porta-servidor}")
//	private Integer porta;

	@Autowired
	private NotificadorProperties properties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: "+properties.getHostServidor());
		System.out.println("Porta: "+properties.getPortaServidor());
		
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}


/*	Classe (bean) criada a partir da interface Notificador que quando executada (na service) irá gerar uma notificação via email,
 * 	assim que um cliente for ativado (no controller), sendo necessario que o nivel de urgencia esteja definido como SEM_URGENCIA (via anotação).
 *
 *	refatorando a classe para utilizar a classe de configuração
 *
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 	<AA> annotation de atributo
 * 
 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 * 
 * 	<AC> @TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA) - valor do @TipoDoNotificador definido que representará a bean quando a injeção for chamada
 * 
 * 	<AC> @Profile("prod") - indica que essa clase ira rodar no ambiente denominado prod
 * 
 * 	<AA> @Value("${notificador.email.host-servidor}") - indica que esse atributo (injetado) estara recebendo os valores configurados em Application.properties
 * */