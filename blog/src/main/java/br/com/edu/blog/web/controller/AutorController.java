package br.com.edu.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.entity.Autor;
import br.com.edu.blog.service.AutorService;

@Controller
@RequestMapping("autor")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@RequestMapping(value = "/perfil/{id}" , method = RequestMethod.GET)
	public ModelAndView perfil(@PathVariable("ïd") Long id){
		Autor autor = autorService.buscarPorId(id);
		return new ModelAndView("autor/perfil").addObject("autor", autor);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(@ModelAttribute("autor") Autor autor){
		
		autorService.salvar(autor);
		return "redirect:/autor/perfil/" + autor.getId();
	}
	
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public ModelAndView addAutor(@ModelAttribute("autor") Autor autor){
		
		return new ModelAndView("autor/cadastro");
	}
}
