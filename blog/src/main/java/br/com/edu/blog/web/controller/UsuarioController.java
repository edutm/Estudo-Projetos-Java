package br.com.edu.blog.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.entity.Avatar;
import br.com.edu.blog.entity.Perfil;
import br.com.edu.blog.entity.Usuario;
import br.com.edu.blog.service.AvatarService;
import br.com.edu.blog.service.UsuarioService;
import br.com.edu.blog.web.editor.PerfilEditorSuporte;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private AvatarService avatarService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Perfil.class, new PerfilEditorSuporte());
	}
	
	
	@RequestMapping(value = {"/update/senha/{id}" , "/updateSenha"},
					method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView updateSenha(@PathVariable("id") Optional<Long> id,
									@ModelAttribute("usuario") Usuario usuario){
		
		ModelAndView view = new ModelAndView();
		
		if(id.isPresent()){
			
			usuario = usuarioService.buscarPorId(id.get());
			view.addObject("usuario", usuario);
			view.setViewName("usuario/atualizar");
			return view;
		}
		
		usuarioService.updateSenha(usuario);
		view.setViewName("redirect:/usuario/perfil/" + usuario.getId());
		
		return view;
	}
	
	@RequestMapping(value = {"/update/{id}", "/update"},
			method ={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView update(@PathVariable("id") Optional<Long> id,
							@ModelAttribute("usuario") Usuario usuario){
		
		ModelAndView view = new ModelAndView();
		
		if(id.isPresent()){
			usuario  = usuarioService.buscarPorId(id.get());
			view.addObject("usuario", usuario);
			view.setViewName("usuario/atualizar");
			return view;
		}
		
		usuarioService.updateNameAndEmail(usuario);
		view.setViewName("redirect:/usuario/perfil/" + usuario.getId());
		
		return view;
	}
	
	@RequestMapping(value="lista", method=RequestMethod.GET)
	public ModelAndView listaUsuarios(ModelMap model){
		
		List<Usuario> todos = usuarioService.buscarTodos();
		model.addAttribute("usuarios", todos);
		
		return new ModelAndView("usuario/usuario", model);
	}
	
	@RequestMapping(value="/perfil/{id}", method=RequestMethod.GET)
	public ModelAndView perfil(@PathVariable("id")Long id){
		
		ModelAndView view = new ModelAndView();
		
		Usuario usuario = usuarioService.buscarPorId(id);
		view.addObject("usuario", usuario);
		view.setViewName("usuario/perfil");
		
		return view;
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String salvar(@ModelAttribute("usuario") Usuario usuario,
			@RequestParam(value = "file", required = false) MultipartFile file){
		
		Avatar avatar = avatarService.getFileUpload(file);
		usuario.setAvatar(avatar);
		
		usuarioService.salvar(usuario);
		
		return "redirect:/usuario/perfil/" + usuario.getId();
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.GET)
	public ModelAndView exibirForm(@ModelAttribute("usuario") Usuario usuario){
		return new ModelAndView("usuario/cadastro");
	}
	
}
