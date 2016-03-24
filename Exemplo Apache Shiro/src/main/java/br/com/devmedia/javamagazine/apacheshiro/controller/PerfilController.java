package br.com.devmedia.javamagazine.apacheshiro.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

import br.com.devmedia.javamagazine.apacheshiro.model.bean.Usuario;
import br.com.devmedia.javamagazine.apacheshiro.services.UsuarioService;
import javassist.bytecode.stackmap.BasicBlock.Catch;

@RequestMapping("/perfil")
@Controller
public class PerfilController {

	@Inject
	private UsuarioService service;

	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Usuario usuario, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            return createForm(uiModel);
        }
        uiModel.asMap().clear();
        
        //alteração feita
        service.salvar(usuario);
        return "redirect:/perfil?formlogin";
    }

	@RequestMapping(params = "form", produces = "text/html")
    public String createForm(Model uiModel) {
		
		Usuario usuarioCorrente = service.getUsuarioCorrente();
		if(usuarioCorrente == null){
			usuarioCorrente = new Usuario();
		}
		
        populateEditForm(uiModel, usuarioCorrente);
        return "perfil/create";
    }
	
	@RequestMapping(value="/login", method = RequestMethod.POST, produces = "text/html")
    public String login(Usuario usuario, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        if (bindingResult.hasErrors()) {
            return loginForm(uiModel);
        }
        uiModel.asMap().clear();
       
       try{
	        //codigo novo começa aqui
	        //criando o token para login usuario
	        UsernamePasswordToken token = new UsernamePasswordToken(usuario.getLogin(), usuario.getSenha());
	        //chamando o metodo para efetuar o login
	        SecurityUtils.getSubject().login(token);
	        
	        //caso passe da linha decima venha abaixo o codigo para redirecionamneto para pagina que estava ou padrao
	        try{
	        	//aqui esta como é feito o redirecionamento para o destino original. 
	        	//Repare que é usado o nome completo da classe porque ja existe nesta 
	        	//classe  outra classe com mesmo nome.
	        	org.apache.shiro.web.util.WebUtils.redirectToSavedRequest(
	        						httpServletRequest, httpServletResponse, "/perfil");
	        }catch(IOException e){
	        	//caso aconteça algum erro ao recupera a pagina original retorno pagina padrao
	        	return "redirect:/perfil";
	        }
		}catch(AuthenticationException e){
			e.printStackTrace();
			//caso aconteça algum problema na altenticacao redireciona pagina de login
			return loginForm(uiModel);
		}
        
//        return "redirect:/perfil/show";
        //retornando null para o spring saber que o shiro ja cuidou do direcionamneto
        return null;
    }
	
	@RequestMapping(params = "formlogin", produces = "text/html")
	public String loginForm(Model uiModel){
		populateLoginForm(uiModel, new Usuario());
		return "perfil/login";
	}
	
	@RequestMapping("/logout")
    public String logout() {
        // TODO Fazer logout
		
		//efetua o logout na shiro
		SecurityUtils.getSubject().logout();
        return "redirect:/";
    }
	
	@RequestMapping("/nao_autorizado")
	public String naoAutorizado(){
		return "perfil/nao_autorizado";
	}

	@RequiresAuthentication
	@RequestMapping(produces = "text/html")
    public String show(Model uiModel) {
		// TODO Pegar usuário logado
		//throw new NotYetImplementedException("Ainda não foi implementado");
//        uiModel.addAttribute("usuario", Usuario.findUsuario(id));
//        uiModel.addAttribute("itemId", id);
        return "perfil/show";
    }

	@RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String update(@Valid Usuario usuario, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateLoginForm(uiModel, usuario);
            return "perfil/update";
        }
        uiModel.asMap().clear();
        usuario.merge();
        return "redirect:/perfil/" + encodeUrlPathSegment(usuario.getId().toString(), httpServletRequest);
    }

	@RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Usuario.findUsuario(id));
        return "perfil/update";
    }

	void populateEditForm(Model uiModel, Usuario usuario) {
        uiModel.addAttribute("usuario", usuario);
    }
	
	void populateLoginForm(Model uiModel, Usuario usuario) {
        uiModel.addAttribute("usuario", usuario);
    }

	String encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
}
