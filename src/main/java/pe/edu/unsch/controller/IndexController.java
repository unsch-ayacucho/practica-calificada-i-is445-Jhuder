package pe.edu.unsch.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import pe.edu.unsch.service.DocenteService;

@Controller

public class IndexController {
	
	
	//private DocenteService docenteService;
	
	@GetMapping({"/","/index"," "})
	public String index( ) {
			//HttpSession session
			//session.setAttribute("nombreDocentes", docenteService.listDocente());    
			
			return "views/index.html";
	}
}

