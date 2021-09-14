package br.com.marcosxavierdev.myfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.notification.NivelUrgencia;
import br.com.marcosxavierdev.myfood.di.notification.Notificador;
import br.com.marcosxavierdev.myfood.di.notification.TipoDoNotificador;
import br.com.marcosxavierdev.myfood.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para cliente "+event.getCliente().getNome());
	}

}


/*	Classe (bean) criada para ser responsavel por ser um ouvinte do ClienteAtivadoEvent e informar a emissão de uma nota fiscal quando um cliente for ativado
 *   
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 
 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 * 
 * 	<AM> @EventListener - indica que a classe é uma listener, que receberá um event e fará o tratamento da mesma
 * 
 * */

