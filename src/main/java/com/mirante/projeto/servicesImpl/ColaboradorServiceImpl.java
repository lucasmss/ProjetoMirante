package com.mirante.projeto.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirante.projeto.models.Colaborador;
import com.mirante.projeto.repositories.ColaboradorRepository;
import com.mirante.projeto.services.ColaboradorService;

@Service
public class ColaboradorServiceImpl implements ColaboradorService{

	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	public List<Colaborador> findAll() {
		return colaboradorRepository.findAll();
	}
	
	public Colaborador findById(long id) { 
		return colaboradorRepository.findById(id).get();
	}
	
	public Colaborador save(Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}

	public Colaborador update(long id) {
		colaboradorRepository.findById(id);
		
		return null;
	}

	public Colaborador deleteById(long id) {
		colaboradorRepository.deleteById(id);
		return null;
	}
	
	
}
