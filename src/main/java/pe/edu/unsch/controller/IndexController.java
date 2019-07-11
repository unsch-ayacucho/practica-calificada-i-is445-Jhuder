package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.unsch.service.SemestreService;

@Controller
public class IndexController {
	
	@Autowired
	private SemestreService semestreService;
	
	@GetMapping({"/","/index"," "})
	public String index(Model model) {
		model.addAttribute("semestres", semestreService.listaDocente());
		return "views/index.html";
	}
}

