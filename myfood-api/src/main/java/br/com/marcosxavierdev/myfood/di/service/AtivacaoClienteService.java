package br.com.marcosxavierdev.myfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;
import br.com.marcosxavierdev.myfood.di.notification.NivelUrgencia;
import br.com.marcosxavierdev.myfood.di.notification.Notificador;
import br.com.marcosxavierdev.myfood.di.notification.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador Notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		Notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
