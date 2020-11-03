package com.mirante.projeto.services;

import java.util.List;

import com.mirante.projeto.models.Colaborador;

public interface ColaboradorService {
	
	List<Colaborador> findAll();
	
	Colaborador findById(long id);
	
	Colaborador save(Colaborador colaborador);
	
	Colaborador update(long id);
	
	Colaborador deleteById(long id);


}
