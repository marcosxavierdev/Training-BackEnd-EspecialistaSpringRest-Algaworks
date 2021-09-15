package br.com.marcosxavierdev.myfood.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
	
	private String hostServidor;
	private Integer portaServidor;
	
	public String getHostServidor() {
		return hostServidor;
	}
	
	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}
	
	public Integer getPortaServidor() {
		return portaServidor;
	}
	
	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}

}




/*	Classe (bean) criada para receber as configurações vinculadas a Application.properties, para transmiti-las onde forem utilizadas (injetadas).
 *
 * 	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 	<AA> annotation de atributo
 * 
 *	<AC> @Component - indica ao spring que essa classe é uma bean (generica)
 * 
 * 	<AC> @ConfigurationProperties("notificador.email") - indica que esta classe representa um arquivo de configuração que sera gerenciado no 
 * 	Application.properties e que serão agrupadas pelo prefixo "notificador.email".
 * 
 * */