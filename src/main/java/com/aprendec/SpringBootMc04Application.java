package com.aprendec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aprendec.service.IPersonaService;

@SpringBootApplication
public class SpringBootMc04Application implements CommandLineRunner{

	@Autowired
	private IPersonaService personaService; // inyectamos
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMc04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//personaService = new PersonaServiceImpl(); // no es necesario instanciar
		personaService.registrar("APRENDEC");
	}

}
