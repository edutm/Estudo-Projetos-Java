package br.com.edu.blog.web.controller;

import java.awt.image.ImageProducer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.edu.blog.entity.Avatar;
import br.com.edu.blog.entity.Usuario;
import br.com.edu.blog.service.AvatarService;
import br.com.edu.blog.service.UsuarioService;

@Controller
@RequestMapping("avatar")
public class AvatarController {

	
	private final static Logger LOG = Logger.getLogger(AvatarController.class);
	
	@Autowired
	private AvatarService avatarService;
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String update(@ModelAttribute("avatar") Avatar avatar, @RequestParam("file") MultipartFile file){
		
		Long id = avatar.getId();
		
		avatar = avatarService.getFileUpload(file);
		avatar.setId(id);
		avatarService.salvarOuAtualizar(avatar);
		
		Usuario usuario = usuarioService.buscarPorAvatar(avatar);
		
		return "redirect:/usuario/perfil/" + usuario.getId();
	}
	
	@RequestMapping(value = "/update/{id}" , method = RequestMethod.GET)
	public ModelAndView preUpdate(@PathVariable("id") Long id, @ModelAttribute("avatar") Avatar avatar){
		
		ModelAndView view = new ModelAndView();
		
		view.addObject("id", id);
		view.setViewName("avatar/atualizar");
		
		return view;
	}
	
	@RequestMapping(value = "/loadAvatar/{id}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> loadAvatar(@PathVariable("id") Long id){
		
		Avatar avatar = avatarService.getFindById(id);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.valueOf(avatar.getTipo()));
		
		InputStream is = new ByteArrayInputStream(avatar.getAvatar());
		
		try{
			
			return new ResponseEntity<byte[]>(IOUtils.toByteArray(is), headers, HttpStatus.OK);
			
		} catch (IOException e) {
			LOG.error("Erro ao fazer o load do avatar - " + e.getMessage());
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				LOG.error("Erro erro ao fechar o stream do is avatar- " + e.getMessage());
			}
		}
		
		return null;
	}
}
