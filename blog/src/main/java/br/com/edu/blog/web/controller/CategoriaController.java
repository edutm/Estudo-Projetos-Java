package br.com.edu.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.entity.Categoria;
import br.com.edu.blog.service.CategoriaService;

@Controller
@RequestMapping("categoria")
public class CategoriaController {

	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/cadastrar" , method = RequestMethod.GET)
	public ModelAndView cadastrar(@ModelAttribute("categoria") Categoria categoria){
		
		ModelAndView view  = new ModelAndView("categoria/cadastro");
		view.addObject("categorias", service.buscarTodos());
		return view;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String add(@ModelAttribute("categoria") Categoria categoria){
		
		service.salvar(categoria);
		return "redirect:/categoria/cadastrar";
	}
	
	@RequestMapping(value = "/deletar/{id}", method = RequestMethod.GET)
	public String deletar(@PathVariable("id") Long id){
		service.deletar(id);
		return "redirect:/categoria/cadastrar";
	}
	
	@RequestMapping(value="/update/{id}" , method = RequestMethod.GET)
	public ModelAndView preUpdate(@PathVariable("id") Long id){
		
		ModelAndView view  = new ModelAndView("categoria/cadastro");
		view.addObject("categoria", service.buscarPorId(id));
		view.addObject("categorias", service.buscarTodos());
		return view;
	}
}
