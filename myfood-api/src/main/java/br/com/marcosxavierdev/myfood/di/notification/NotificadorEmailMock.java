package br.com.marcosxavierdev.myfood.di.notification;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

@Profile("dev")
@TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {
	
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail: MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}


/*	classe que simula outra, criada para ser registrada no container spring somente no ambiente denominado
 *  OBS: se não estiver no ambiente designado, nem vai ser reconhecido pelo spring(o que impede a injeção).
 *
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 
 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 * 
 * 	<AC> @TipoDoNotificador(value = NivelUrgencia.SEM_URGENCIA) - valor do @TipoDoNotificador definido que representará a bean quando a injeção for chamada
 * 
 * 	<AC> @Profile("dev") - indica que essa clase ira rodar no ambiente denominado dev
 * 
 * 
 * */