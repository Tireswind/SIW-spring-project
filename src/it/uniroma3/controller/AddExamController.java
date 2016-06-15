package it.uniroma3.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.commons.validator.DateValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.validator.routines.AbstractCalendarValidator;
import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.AbstractCalendarValidator;
import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.models.Paziente;
import it.uniroma3.models.Specializzazione;
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.MedicoService;
import it.uniroma3.service.PazienteService;
import it.uniroma3.service.SpecializzazioneService;
import it.uniroma3.service.TipologiaEsameService;

@Controller
public class AddExamController {
	@Autowired
	private MedicoService medicoService;
	
	@Autowired
	private TipologiaEsameService tipologiaService;
	
	@Autowired
	private PazienteService pazienteService;
	
	@Autowired
	private EsameService esameService;
	
	@Autowired
	private SpecializzazioneService specializzazioneService;
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/addExam",method = RequestMethod.GET)
	public String welcomeAddExam(ModelMap model) {
		/*Paziente p = new Paziente();p.setCognome("sannion");p.setNome("roberto");p.setId("rs");p.setPassword("passs");
		p.setDataDiNascita(new Date("16/01/1994"));p.setSesso("m");
		pazienteService.insertPatient(p);*/
		/*
		 * Specializzazione spec = specializzazioneService.findSpecFromId((long)701);
		Medico m = new Medico("gigi","d'alessio",spec);
		medicoService.insertDoctor(m);
		*/
		
		model.addAttribute("dottori",medicoService.listDoctor());
		model.addAttribute("tipologie", tipologiaService.listExamType());
		model.addAttribute("pazienti", pazienteService.listPatient());
		
		return "addExam";
	}
	@RequestMapping(value="/aggiungiEsame", method= RequestMethod.POST)
	public String addExam(HttpServletRequest request, HttpServletResponse response){
		
		Date d = new DateValidator().validate(request.getParameter("dataE"));
		if(d.before(new Date())){
			request.setAttribute("dottori",medicoService.listDoctor());
			request.setAttribute("tipologie", tipologiaService.listExamType());
			request.setAttribute("pazienti", pazienteService.listPatient());
			request.setAttribute("dateUnvalid", "la data di esecuzione è precedente a quella di prenotazione");
			return "addExam";
		}
		Medico esaminatore = medicoService.getMedicoFromId(Long.valueOf(request.getParameter("medico")));
		TipologiaEsame te = tipologiaService.getTipologiaFromId(Long.valueOf(request.getParameter("tipologia")));
		Paziente paziente = pazienteService.getPazienteFromId(Long.valueOf(request.getParameter("paziente")));
		@SuppressWarnings("deprecation")
		Esame e = new Esame(paziente, esaminatore, te, new Date(), d);
		esameService.insertExam(e);

		request.setAttribute("esame", e);

		return "riepilogoAggiungiEsame";
	}
	
	/*
	
	@RequestMapping(value="/addExam2",method = RequestMethod.GET)
	public ModelAndView welcomeAddExam2(ModelMap command) {
		//da sostituire con
		//medicoService.listDoctor();
		
		Medico dottore = new Medico("gigi","d'alessio",null);
		List<Medico> dottori = new ArrayList<Medico>();
		dottori.add(0, dottore);dottori.add(new Medico("anna","tatangel9",null));
		command.addAttribute("dottori", dottori);
		
	    return new ModelAndView("addExam", "command", new Esame());
	}
	*/
	/*
	@RequestMapping(value="/aggiungiEsame",method = RequestMethod.POST)
	public String welcomeMedici(@ModelAttribute("command")Esame esame,BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()){
			model.addAttribute("divina", "ci sono errori nei parametri");
			return "riepilogoAggiungiEsame";
		}
		model.addAttribute("diprova", esame.getDiprova()+" inserito");
		model.addAttribute("dottore", esame.getEsaminatore() + " inserito");
		
		return "riepilogoAggiungiEsame";
	}
*/
	
}
