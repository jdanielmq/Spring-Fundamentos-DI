package cl.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.springboot.di.app.services.IMiServicio;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("MiServicioComplejo")
	private IMiServicio MiServicio;
	

	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("titulo", MiServicio.operacion());
		return "index";
	}
	
}
