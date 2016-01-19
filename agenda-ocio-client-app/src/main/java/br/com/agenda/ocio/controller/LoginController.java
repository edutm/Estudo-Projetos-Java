package br.com.agenda.ocio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.agenda.ocio.dto.UsuarioDTO;
import br.com.agenda.ocio.exception.ServicoException;
import br.com.agenda.ocio.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/")
	public String login(final Model model) throws ServicoException{
		
		List<UsuarioDTO> usuarios = usuarioService.getUsuarios();
		model.addAttribute("usuarios", usuarios);
		
		return "login";
	}
}
