package br.com.marcosxavierdev.myfood.di.notification;

import br.com.marcosxavierdev.myfood.di.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}

/*	Interface que irá gerenciar as beans (classes injetáveis) NotificadorEmail e NotificadorSMS
 * 
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 
 * 
 * 
 * */