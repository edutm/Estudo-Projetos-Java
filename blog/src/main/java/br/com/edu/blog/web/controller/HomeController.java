package br.com.edu.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/{permalink}", method = RequestMethod.GET)
	public ModelAndView abrirPostagem(@PathVariable("permalink")String permalink,ModelMap model){
		
		model.addAttribute("postagem", postagemService.buscarPorPermalink(permalink));
		return new ModelAndView("post", model);
	}
	
	@RequestMapping(value = "/categoria/{link}", method = RequestMethod.GET)
	public ModelAndView postsPorCategoria(@PathVariable("link") String link){
		
		ModelAndView view = new ModelAndView("posts");
		view.addObject("postagens",postagemService.buscarPorCategoria(link));
		return view;
	}
	
	@RequestMapping(value = "/autor/{nome}", method = RequestMethod.GET)
	public ModelAndView postsPorAutor(@PathVariable("nome") String nome){
		
		ModelAndView view = new ModelAndView("posts");
		view.addObject("postagens",postagemService.buscarPorAutor(nome));
		return view;
	}
}
