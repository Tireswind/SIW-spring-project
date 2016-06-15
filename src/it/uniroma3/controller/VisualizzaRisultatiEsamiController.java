package it.uniroma3.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Risultato;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.PazienteService;
import it.uniroma3.service.RisultatoService;

@Controller
public class VisualizzaRisultatiEsamiController {
	
	@Autowired
	private EsameService esameService;
	@Autowired
	private PazienteService pazienteService;

	
	@RequestMapping(value="/visualizzaEsami",method = RequestMethod.GET)
	public String welcomeExams(HttpServletRequest req, HttpServletResponse resp) {
		/*non so come vuoi gestire l autenticazione, qui dovrebbero arriver l id e la password dell utente già loggato*/
		req.setAttribute("esami", esameService.listExamForPatientId(pazienteService.getPazienteFromId((long) (1))));//da cambiare con model.addAttribute se si usa model
		return "esamiPaziente";
	}
	@RequestMapping(value="/visualizzaEsitiEsame",method = RequestMethod.GET)
	public String esitiEsame(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("a", Long.valueOf(req.getParameter("esameScelto")));
		Esame e = esameService.getExamById(Long.valueOf(req.getParameter("esameScelto")));
		List<Risultato> results = e.getRisultati();
		if(results.size()>0){
			req.setAttribute("risultati", results);
			req.setAttribute("numberResults", results.size());
		}
		else
			req.setAttribute("nope", "non ci sono risultati");
		return "esitiEsame";
	}
	
}
