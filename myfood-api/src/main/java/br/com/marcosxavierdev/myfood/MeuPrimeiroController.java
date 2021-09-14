package br.com.marcosxavierdev.myfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.marcosxavierdev.myfood.di.model.Cliente;
import br.com.marcosxavierdev.myfood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}


	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente marcos = new Cliente("Marcos","marcos@123","73988881111");
		ativacaoClienteService.ativar(marcos);
		return "hello!";
	}

}

/*	<AC> annotation de classe
 * 	<AM> annotation de metodo
 * 
 *	<AC> @Controller - define que a classe é um controlador (é uma bean - objeto injetável)
 * 
 *	<AM> @GetMapping("/hello") - mapeamento de metodo GET
 * 
 *	<AM> @ResponseBody - indica que o retorno seja devolvido como a resposta da requisição
 * 
 * 
 * */
