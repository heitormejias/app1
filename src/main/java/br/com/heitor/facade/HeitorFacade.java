package br.com.heitor.facade;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HeitorFacade {

	@Value("${teste}")
    private String teste;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String exemplo() {
		return "Valor de teste: " + teste;
	}
}
