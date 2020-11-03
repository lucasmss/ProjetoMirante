package com.mirante.projeto.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mirante.projeto.models.Colaborador;
import com.mirante.projeto.services.ColaboradorService;

@Controller
public class ColaboradorController {
	
	@Autowired
	ColaboradorService colaboradorService;
	
	@RequestMapping(value = "/pesquisa", method = RequestMethod.GET)
	public ModelAndView getColaboradores() {
		ModelAndView mv = new ModelAndView("pesquisa");
		List<Colaborador> colaboradores = colaboradorService.findAll();
		mv.addObject("colaboradores", colaboradores);
		
		return mv;
	}
	
	@RequestMapping(value = "/visualizar/{id}", method = RequestMethod.GET)
	public ModelAndView getColaborador(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("visualizar");
		Colaborador colaborador = colaboradorService.findById(id);
		mv.addObject("colaborador", colaborador);
		
		return mv;
	}
	
	@RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
	public ModelAndView getEditar(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("editar");
		Colaborador colaborador = colaboradorService.findById(id);
		mv.addObject("editarColaborador", colaborador);
		
		return mv;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String getCadastro() {
		return "cadastrar";
	}
	
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String saveColaborador(@Valid Colaborador colaborador, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return "redirect:/cadastrar";
		}
		colaboradorService.save(colaborador);
		return "redirect:/pesquisa";
	}

}
