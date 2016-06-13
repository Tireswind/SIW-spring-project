package it.uniroma3.controller;

import org.springframework.stereotype.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import it.uniroma3.models.Medico;
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.service.MedicoService;
import it.uniroma3.service.MedicoServiceImpl;
import it.uniroma3.service.TipologiaEsameService;
import it.uniroma3.service.TipologiaEsameServiceImpl;

@Controller
public class DynamicPagesController {
	//@Autowired
	//private MedicoService medicoService;
	//@ModelAttribute("medico")
	//public medico createMedicoModel() {
	//	return new Medico();
	//}
	
	@RequestMapping(value="/medici",method = RequestMethod.GET)
	public String welcomeMedici(ModelMap model) {
		MedicoServiceImpl medicoService = new MedicoServiceImpl(); 
		List<Medico> doctors = medicoService.listDoctor();
		if(doctors == null)
			model.addAttribute("doctors", "nulla da mostrare");
		else
			model.addAttribute("doctors", doctors);
		return "medici";
	}
	
	@RequestMapping(value="/tipologieEsami",method = RequestMethod.GET)
	public String welcomeTipologie(ModelMap model) {
		TipologiaEsameService tipologia = new TipologiaEsameServiceImpl(); 
		List<TipologiaEsame> tipologie = tipologia.listExamType();
		if(tipologie == null)
			model.addAttribute("tipologie", "nulla da mostrare");
		else
			model.addAttribute("tipologie", tipologie);
		return "tipologieEsami";
	}
}
