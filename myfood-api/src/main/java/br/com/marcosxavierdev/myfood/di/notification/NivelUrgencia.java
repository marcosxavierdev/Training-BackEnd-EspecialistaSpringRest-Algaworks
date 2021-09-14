package br.com.marcosxavierdev.myfood.di.notification;

public enum NivelUrgencia {
	
	URGENTE, SEM_URGENCIA;

}


/*	Enum criada para ser usada no chaveamento entre os níveis de urgencia devido ao gerenciamento de beans via anotação. 
 * 	Cada bean vai receber um desses valores, que serão alternadas entre si de acordo com a necessidade.
 */
 
