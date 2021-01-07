package com.aprendec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendec.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo; // inyectar
	
	@Override
	public void registrar(String nombre) {
		//repo =  new PersonaRepoImpl(); // no es necesario instanciar
		repo.registrar(nombre);
	}

}
