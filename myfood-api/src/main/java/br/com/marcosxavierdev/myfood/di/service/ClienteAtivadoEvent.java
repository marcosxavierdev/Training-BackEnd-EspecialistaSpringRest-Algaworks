package br.com.marcosxavierdev.myfood.di.service;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}


/*	Classe criada para a evento que sera disparado na classe AtivacaoClienteService quando o metodo de ativação de cliente for executado.
 *
 */