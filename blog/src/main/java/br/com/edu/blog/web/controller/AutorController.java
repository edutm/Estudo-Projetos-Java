package br.com.edu.blog.web.controller;

import java.util.Arrays;
import java.util.Optional;

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
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ModelAndView preUpdate(@PathVariable("id") Long id){
		
		ModelAndView view = new ModelAndView("autor/cadastro");
		Autor autor = autorService.buscarPorId(id);
		view.addObject("autor", autor);
		
		return view;
	}
	
	@RequestMapping(value = {"/perfil/{id}", "/lista" }, method = {RequestMethod.GET , RequestMethod.GET})
	public ModelAndView perfil(@PathVariable("id") Optional<Long> id){
		
		ModelAndView view = new ModelAndView("autor/perfil");
		if(id.isPresent()){
			Autor autor = autorService.buscarPorId(id.get());
			view.addObject("autores", Arrays.asList(autor));
		}else{
			view.addObject("autores", autorService.buscarTodos());
		}
		
		return view;
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
	
	@RequestMapping(value = "/deletar/{id}" , method = RequestMethod.GET)
	public String delete(@PathVariable("id")Long id){
		
		autorService.deletar(id);
		return "redirect:/autor/lista";
	}
}
