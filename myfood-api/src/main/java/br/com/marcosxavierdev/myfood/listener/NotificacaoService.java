package br.com.marcosxavierdev.myfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.notification.NivelUrgencia;
import br.com.marcosxavierdev.myfood.di.notification.Notificador;
import br.com.marcosxavierdev.myfood.di.notification.TipoDoNotificador;
import br.com.marcosxavierdev.myfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo!");
	}

}


/*	Classe (bean) criada para ser responsavel por ser um ouvinte do ClienteAtivadoEvent, criado para a gerenciar a forma de notificação de quando um cliente for ativado
 *  
 * 
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 
 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 * 
 * 	<AM> @EventListener - indica que a classe é uma listener, que receberá um event e fará o tratamento da mesma
 * 
 * 
 *  <AA> @Autowired - anotação de injeção de dependencia que indica ao Spring que aquele é um ponto de injeção
 * 
 * 	<AA> @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA) - anotação criada para ser usada na desambiguação de beans 
 * 	(onde a mesma é chaveada entre os tipos de urgencia definidos para alterar a injeção de dependencias)
 * 

 * 
 * */

