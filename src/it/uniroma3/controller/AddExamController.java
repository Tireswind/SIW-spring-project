package it.uniroma3.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.validator.routines.DateValidator;
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
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.MedicoService;
import it.uniroma3.service.PazienteService;
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
	
	@RequestMapping(value="/addExam",method = RequestMethod.GET)
	public String welcomeAddExam(ModelMap model) {
		/*da sostituire tutto con
		 model.addAttribute("dottori",medicoService.listDoctor());
		 model.addAttribute("tipologie", tipologiaService.listExamType());
		 model.addAttribute("pazienti", pazienteService.listPatient());
		*/
		/*
		List<Medico> dottori = new ArrayList<Medico>();
		Medico a = new Medico("anna","tatangel9",null);a.setCodice((long)2);
		Medico b = new Medico("gigi","d'alessio",null);b.setCodice((long)1);
		dottori.add(a);dottori.add(b);
		List<TipologiaEsame> tipologie = new ArrayList<TipologiaEsame>();
		TipologiaEsame t1 = new TipologiaEsame("t1","un esame t1");t1.setCodice((long)1);
		TipologiaEsame t2 = new TipologiaEsame("t2","un altro esame t2");t1.setCodice((long)2);
		tipologie.add(t1);tipologie.add(t2);
		List<Paziente> pazienti = new ArrayList<>();
		Paziente p = new Paziente("carlo","ciavarella","fetish","password");p.setCodice((long)5);
		pazienti.add(p);
		model.addAttribute("tipologie", tipologie);
		model.addAttribute("dottori", dottori);
		model.addAttribute("pazienti", pazienti);
		*/
		return "addExam";
	}
	@RequestMapping(value="/aggiungiEsame", method= RequestMethod.POST)
	public String addExam(HttpServletRequest request, HttpServletResponse response){
		Esame e = new Esame(pazienteService.getPazienteFromId(Long.valueOf(request.getParameter("paziente"))),
				  			medicoService.getMedicoFromId(Long.valueOf(request.getParameter("medico"))),
							tipologiaService.getTipologiaFromId(Long.valueOf(request.getParameter("tipologia"))),
							new DateValidator().validate((String) request.getParameter("dataP"),"dd/MM/yyyy"),
							new DateValidator().validate((String) request.getParameter("dataE"),"dd/MM/yyyy")
							);
		esameService.insertExam(e);
		/*inserire tutti i valori inseriti per l esame ed inviarli di riepilogo alla pagina rie...*/
		request.setAttribute("medico", medicoService.getMedicoFromId(Long.valueOf(request.getParameter("medico"))));
		/*...*/
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
