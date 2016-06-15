package it.uniroma3.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Medico;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.MedicoService;

@Controller
public class VisualizzaEsamiMedici {
	
	@Autowired
	private MedicoService medicoService;
	@Autowired
	private EsameService esameService;
	
	@RequestMapping(value="/esamiMedico",method = RequestMethod.GET)
	public String viewExamByDoctor(HttpServletRequest req, HttpServletResponse resp) {
		/*in medici.jsp l amministratore sceglie uno dei medici di cui vuole vedere i risultati, viene inviato nella form il suo id*/
		Medico m = medicoService.getMedicoFromId(Long.valueOf(req.getParameter("medico")));
		List<Esame> esami = esameService.getExamFromDoctor(m);
		req.setAttribute("esami", esami);
		return "esamiMedico";
	}
}
