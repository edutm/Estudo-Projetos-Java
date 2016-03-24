package br.com.devmedia.javamagazine.apacheshiro.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.devmedia.javamagazine.apacheshiro.model.bean.Usuario;
import br.com.devmedia.javamagazine.apacheshiro.services.UsuarioService;

@Component("usuarioCorrenteInterceptor")
public class UsuarioCorrenteInterceptor extends HandlerInterceptorAdapter{
	
	@Inject
	private UsuarioService service;

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		Usuario usuario = service.getUsuarioCorrente();
		if(usuario != null){
			request.setAttribute(UsuarioService.USUARIO_CORRENTE, usuario);
		}
		
	}
	
	

}
