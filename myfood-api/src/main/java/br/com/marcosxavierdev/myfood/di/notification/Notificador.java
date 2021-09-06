package br.com.marcosxavierdev.myfood.di.notification;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}