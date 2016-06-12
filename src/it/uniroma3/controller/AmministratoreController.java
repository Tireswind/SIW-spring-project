package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
//import org.springframework.validation.annotation.Validated;

import it.uniroma3.models.Amministratore;
import it.uniroma3.service.AmministratoreService;

@Controller
@RequestMapping("/amministratore")
public class AmministratoreController extends WebMvcConfigurerAdapter{

	@Autowired
	private AmministratoreService adminService;

	@Autowired
	@Qualifier("amministratoreValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@ModelAttribute("amministratore")
	public Amministratore createEmployeeModel() {
		return new Amministratore();
	}

	@RequestMapping(value = "/listadmin", method =  RequestMethod.GET)
	public String listEmployees(Model model) {
		model.addAttribute("adminsList", adminService.listAdmin());
		return "amministratore";
	}

	@RequestMapping(value = "/addadmin", method = RequestMethod.GET)
	public String addEmployee(Model model) {
		return "/addadmin";
	}

	/*	@RequestMapping(value = "/updatemployee", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") @Validated Employee employee,	BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) 
			return "addemployee";
		this.adminService.insertEmployee(employee);
		model.addAttribute("employeesList",	adminService.listEmployee());
		return "employee";
	}*/

	@RequestMapping(value = "/delete/{adminId}", method = RequestMethod.GET)
	public String deleteAdmin(@PathVariable("adminId") Long adminId, Model model) {
		this.adminService.deleteAdmin(adminId);
		model.addAttribute("adminsList", adminService.listAdmin());
		return "amministratore";
	}
}
