package br.com.marcosxavierdev.myfood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import br.com.marcosxavierdev.myfood.di.model.Cliente;
import br.com.marcosxavierdev.myfood.di.notification.NivelUrgencia;
import br.com.marcosxavierdev.myfood.di.notification.Notificador;
import br.com.marcosxavierdev.myfood.di.notification.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
//	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//	@Autowired
//	private Notificador Notificador;
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
//		Notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
}


/* 	Classe Service com a função de extrair do controller a responsabilidade de ativar um cliente (ativo = true) após ser criado, 
 * 	aplicando uma regra de negocio, que irá disparar uma notificação (Email ou SMS) de acordo com a especificação de urgencia do momento 
 * 	(especificado na injeção de dependencia gerenciada por @TipoDoNotificador, fazendo o gerenciamento de beans com a anotação).
 * 
 * 	Classe refatorada para criar um event no lugar da injeção de dependencia para diminuir o acoplamento, com o intuito de disparar 
 * 	uma notificação sempre que um usuario for ativado
 * 
 * 
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 	<AA> annotation de atributo
 * 
 * 	<AC> @Component - anotação que informa que a classe é uma bean (assim como controller, repository e service)
 * 
 * 	<AA> @Autowired - anotação de injeção de dependencia que indica ao Spring que aquele é um ponto de injeção
 * 
 * 	<AA> @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA) - anotação criada para ser usada na desambiguação de beans 
 * 	(onde a mesma é chaveada entre os tipos de urgencia definidos para alterar a injeção de dependencias)
 * 
 * 	<AM> @PostConstruct - anotação que indica o inicio do ciclo de vida da bean (depois do construtor)
 * 
 * 	<AM> @PreDestroy - anotação que indica instantes antes do fim do ciclo de vida da bean (quando parar a aplicação)
 * 	
 * */