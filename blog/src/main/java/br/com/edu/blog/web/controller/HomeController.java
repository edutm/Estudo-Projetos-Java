package br.com.edu.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.service.PostagemService;

@Controller
public class HomeController {

	
	@Autowired
	private PostagemService postagemService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelMap model){
		
		model.addAttribute("postagens", postagemService.buscarTodos());
		return new ModelAndView("posts", model);
	}
}
