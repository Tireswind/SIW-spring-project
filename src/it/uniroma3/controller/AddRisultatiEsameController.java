
package it.uniroma3.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.models.Esame;
import it.uniroma3.models.Risultato;
import it.uniroma3.service.EsameService;
import it.uniroma3.service.RisultatoService;

@Controller
public class AddRisultatiEsameController {
	
	/*i risultati per un esame vengono caricati uno alla volta*/

	@Autowired
	private EsameService esameService;
	@Autowired
	private RisultatoService risultatoService;
	
	@RequestMapping(value="/scegliEsameDiCuiCaricariIRisultati",method = RequestMethod.GET)
	public String chooseExam(HttpServletRequest req, HttpServletResponse resp){
		req.setAttribute("esame", esameService.getExamById(Long.valueOf(req.getParameter("esame"))));
		return "aggiungiRisultatiEsame";
	}
	@RequestMapping(value="/aggiungiRisultatiEsame",method = RequestMethod.GET)
	public String addResultsToExam(HttpServletRequest req, HttpServletResponse resp){
		Risultato r = new Risultato(req.getParameter("descrizione"),Double.valueOf(req.getParameter("valore")));
		/*se il risultato per l esame in question è stato già inserito(stessa descrizione) se ne fa il merge quinid cambia solo il valore*/
		Esame e = esameService.getExamById(Long.valueOf(req.getParameter("esame")));
		List<Risultato> listaResults = e.getRisultati();
		listaResults.add(r);
		e.setRisultati(listaResults);
		esameService.merge(e);
		risultatoService.insertResult(r);
		return "aggiungiRisultatiEsame";
	}
	@RequestMapping(value="/riepilogoRisultatiInseriti",method = RequestMethod.GET)
	public String showResults(HttpServletRequest req, HttpServletResponse resp){
		return "riepilogoRisultatiEsameAggiunti";
	}

}
