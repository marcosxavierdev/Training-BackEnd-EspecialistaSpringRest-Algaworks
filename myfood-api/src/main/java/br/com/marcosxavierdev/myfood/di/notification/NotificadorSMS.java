package br.com.marcosxavierdev.myfood.di.notification;

import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

@TipoDoNotificador(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}


/*	Classe (bean) criada a partir da interface Notificador que quando executada (na service) irá gerar uma notificação via SMS,
 * 	assim que um cliente for ativado (no controller), sendo necessario que o nivel de urgencia esteja definido como URGENTE (via anotação).
 * 
 * 	<AC> annotation de classe
 *
 * 	<AM> annotation de metodo

 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 *
 *	<AC> @TipoDoNotificador(value = NivelUrgencia.URGENTE) - valor do @TipoDoNotificador definido que representará a bean quando a injeção for chamada
 * 
 * */