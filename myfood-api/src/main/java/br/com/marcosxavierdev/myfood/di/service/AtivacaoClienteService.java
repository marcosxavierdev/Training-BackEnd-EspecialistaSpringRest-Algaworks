package br.com.marcosxavierdev.myfood.di.service;

import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;
import br.com.marcosxavierdev.myfood.di.notification.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador Notificador;
		
	public AtivacaoClienteService(Notificador Notificador) {
		this.Notificador = Notificador;
		System.out.println("AtivacaoCLienteService: " + Notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();

		Notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
