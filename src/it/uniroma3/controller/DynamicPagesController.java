package it.uniroma3.controller;

import org.springframework.stereotype.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import it.uniroma3.models.Amministratore;
import it.uniroma3.models.Medico;
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.service.AmministratoreService;
import it.uniroma3.service.MedicoService;
//import it.uniroma3.service.MedicoServiceImpl;
import it.uniroma3.service.TipologiaEsameService;
//import it.uniroma3.service.TipologiaEsameServiceImpl;

@Controller
public class DynamicPagesController {
	//@Autowired
	//private MedicoService medicoService;
	//@ModelAttribute("medico")
	//public medico createMedicoModel() {
	//	return new Medico();
	//}

	@Autowired
	private MedicoService medicoService;

	@RequestMapping(value="/medici",method = RequestMethod.GET)
	public String welcomeMedici(ModelMap model) {
		//MedicoServiceImpl medicoService = new MedicoServiceImpl(); 
		List<Medico> doctors = medicoService.listDoctor();
		if(doctors == null)
			model.addAttribute("doctors", "nulla da mostrare");
		else
			model.addAttribute("doctors", doctors);
		return "medici";
	}

	@Autowired
	private TipologiaEsameService tipologia;

	@RequestMapping(value="/tipologieEsami",method = RequestMethod.GET)
	public String welcomeTipologie(ModelMap model) {
		//TipologiaEsameService tipologia = new TipologiaEsameServiceImpl(); 
		List<TipologiaEsame> tipologie = tipologia.listExamType();
		if(tipologie == null)
			model.addAttribute("tipologie", "nulla da mostrare");
		else
			model.addAttribute("tipologie", tipologie);
		return "tipologieEsami";
	}


	@Autowired
	private AmministratoreService admin;

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/adminProfile",method = RequestMethod.GET)
	public String welcomeAdmin(ModelMap model) {
		return "adminProfile";
	}

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/addExamType", method = RequestMethod.GET)
	public String addExamType(ModelMap model) {
		return "addExamType";
	}

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/addExam", method = RequestMethod.GET)
	public String addExam(ModelMap model) {
		return "addExam";
	}

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/addDoctor", method = RequestMethod.GET)
	public String addDoctor(ModelMap model) {
		return "addDoctor";
	}

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/addPatient", method = RequestMethod.GET)
	public String addPatient(ModelMap model) {
		return "addPatient";
	}

	@Secured({"ROLE_ADMIN"})
	@RequestMapping(value="/patientProfile", method = RequestMethod.GET)
	public String patientProfile(ModelMap model) {
		return "patientProfile";
	}

}