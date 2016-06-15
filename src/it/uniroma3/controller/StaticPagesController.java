package it.uniroma3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
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
import it.uniroma3.service.AmministratoreService;
import it.uniroma3.service.MedicoService;
import it.uniroma3.service.TipologiaEsameService;

//import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
//import org.springframework.validation.annotation.Validated;



@Controller
public class StaticPagesController {

	//@Autowired
	//private MedicoService medicoService;
	//@Qualifier("medicoService")

	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String welcomeIndex (ModelMap model){
		return "index";
	}


	@RequestMapping(value="/contatti",method = RequestMethod.GET)
	public String welcomeContatti(ModelMap model) {
		return "contatti";
	}
	@RequestMapping(value="/faq",method = RequestMethod.GET)
	public String welcomeFAQ(ModelMap model) {
		return "faq";
	}

	@RequestMapping(value="/loginPage",method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		return "loginPage";
	}

	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String logoutPage(ModelMap model) {
		return "logout";
	}

	@Autowired
	private AmministratoreService admin;

	/*@Autowired
	private TipologiaEsameService examType;*/







}
