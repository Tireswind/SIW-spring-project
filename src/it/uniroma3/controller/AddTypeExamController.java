package it.uniroma3.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.emory.mathcs.backport.java.util.Arrays;
import it.uniroma3.models.Prerequisito;
import it.uniroma3.models.Specializzazione;
import it.uniroma3.models.TipologiaEsame;
import it.uniroma3.service.PrerequisitoService;
import it.uniroma3.service.SpecializzazioneService;
import it.uniroma3.service.TipologiaEsameService;

@Controller
public class AddTypeExamController {
	
	@Autowired
	private TipologiaEsameService tipologiaService;
	
	@Autowired
	private SpecializzazioneService specializzazioneService;
	
	@Autowired
	private PrerequisitoService prerequisitoService;
	
	@RequestMapping(value="/addTypeExam",method = RequestMethod.GET)
	public String welcomeTypeExam(ModelMap model) {
		/*gestione verifica amministratore*/
		return "addTypeExam";
	}
	/*POST giusto perchè gli url lunghi sei mesi non mi piacciono*/
	@RequestMapping(value="/addTipologiaEsame",method = RequestMethod.POST)
	public String addTypeExam(HttpServletRequest req, HttpServletResponse resp) {
		/*gestione verifica amministratore*/
		TipologiaEsame te = tipologiaService.getTipologiaFromId(Long.valueOf(req.getParameter("nuovoNome")));
		if(te!=null)
			return "addTypeExam";
		else{
			/*creazione della tipologia in base ai parametri immessi nella form*/
			te.setDescrizione(req.getParameter("nuovaDescrizione"));
			te.setNome(req.getParameter("nuovoNome"));
			te.setPrezzo(Double.valueOf("nuovoPrezzo"));
			/*la specializzazione è immessa da un menù a tendina a scelta obbligata*/
			te.setSpecializzazione_abilitante(specializzazioneService.findSpecFromId(Long.valueOf(req.getParameter("spec"))));
			/*i requisiti arrivano grazie a jquery come una stringa di descri<ioni intervallata da '&' come divisorio*/
			String[] requisiti = req.getParameter("requisiti").split("&");
			List<Prerequisito> listaReq = new LinkedList<>();
			for(String requisito : requisiti){
				Prerequisito p = new Prerequisito("requisito");
				prerequisitoService.insertRequirement(p);
				listaReq.add(p);				
			}
			te.setRequisiti(listaReq);
			tipologiaService.insertExamType(te);
		}
		req.setAttribute("tipologiaImmessa", te);
		return "riepilogoTipologiaAggiunta";
	}
}
