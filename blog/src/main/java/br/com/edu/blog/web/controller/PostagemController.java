package br.com.edu.blog.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.entity.Postagem;
import br.com.edu.blog.service.CategoriaService;
import br.com.edu.blog.service.PostagemService;
import br.com.edu.blog.web.editor.CategoriaEditorSuporte;

@Controller
@RequestMapping("postagem")
public class PostagemController {

	@Autowired
	private PostagemService postagemService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@InitBinder
	public void initBinder(WebDataBinder bind){
		bind.registerCustomEditor(List.class, 
				new CategoriaEditorSuporte(List.class, categoriaService));
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add(@ModelAttribute Postagem postagem){
		return new ModelAndView("postagem/cadastro")
				.addObject("categorias", categoriaService.buscarTodos());
	}
	
	@RequestMapping( value = "/lista", method = RequestMethod.GET)
	public ModelAndView lista(){
		
		ModelAndView view = new ModelAndView("postagem/lista");
		view.addObject("postagens", postagemService.buscarTodos());
		return view;
		
	}
	
	@RequestMapping(value= "/salvar" ,  method = RequestMethod.POST)
	public String salvar(@ModelAttribute Postagem postagem ){
		postagemService.salvarOuAtualizar(postagem);
		return "redirect:/postagem/lista";
	}
	
	@RequestMapping(value="/deletar/{id}" , method = RequestMethod.GET)
	public String deletar(@PathVariable("id") Long id){
		
		postagemService.deletar(id);
		return "redirect:/postagem/lista";
	}
	
	@RequestMapping(value="/update/{id}", method = RequestMethod.GET)
	public ModelAndView preUpdate(@PathVariable("id") Long id){
		
		Postagem postagem = postagemService.buscarPorId(id);
		return new ModelAndView("postagem/cadastro")
				.addObject("postagem", postagem)
				.addObject("categorias", categoriaService.buscarTodos());
		
	}
}
