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
