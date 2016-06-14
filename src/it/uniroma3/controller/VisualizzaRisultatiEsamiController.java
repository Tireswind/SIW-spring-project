package it.uniroma3.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.models.Esame;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.PazienteService;

@Controller
public class VisualizzaRisultatiEsamiController {
	
	@Autowired
	private EsameService esameService;
	
	@RequestMapping(value="/visualizzaEsami",method = RequestMethod.GET)
	public String welcomeExams(HttpServletRequest req, HttpServletResponse resp) {
		/*non so come vuoi gestire l autenticazione, qui dovrebbero arriver l id e la password dell utente già loggato*/
		List<Esame> esami = esameService.listExamForPatientId("id del paziente");
		req.setAttribute("esami", esami);//da cambiare con model.addAttribute se si usa model
		return "esamiPaziente";
	}
	@RequestMapping(value="/visualizzaEsitiEsame",method = RequestMethod.GET)
	public String esitiEsame(HttpServletRequest req, HttpServletResponse resp) {
		long id;
		/*qui ritorna l esame scelto tra quelli inviati col controller precedente*/
		req.setAttribute("risultati", esameService.resultsById(id));
		
		return "esitiEsame";
	}
	
}
