package br.com.devmedia.javamagazine.apacheshiro.services;

import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.devmedia.javamagazine.apacheshiro.model.bean.Usuario;

@Service
public class UsuarioService {
	
	public static final String USUARIO_CORRENTE = "usuarioCorrente";

	@Value(value = "${criptografia.numeroDeIteracoesDeHash}")
	private int NUMERO_DE_INTERACAO_HASH;
	
	@Inject
	private RandomNumberGenerator numberGenerator;
	
	public void salvar(Usuario usuario){
		
		//gerar salt aleatorio
		ByteSource salt = numberGenerator.nextBytes();
		
		//faz o hash da senha SHA-215, o salt gerado e o numero de iterações
		Sha512Hash hash = new Sha512Hash(usuario.getSenha(), salt, NUMERO_DE_INTERACAO_HASH);
		String senhaHashBase64 = hash.toBase64();
		
		//seta a senha e salt no usuario e persite
		usuario.setSalt(salt.toBase64());
		usuario.setSenha(senhaHashBase64);
		usuario.persist();
		
	}
	
	public Usuario getUsuarioCorrente(){
		
		//pega o subject corrente e verifica se esta autenticado
		Subject subject = SecurityUtils.getSubject();
		if(!subject.isAuthenticated()){
			return null;
		}
		
		Usuario usuario = (Usuario)subject.getSession().getAttribute(USUARIO_CORRENTE);
		if(usuario == null){
			Long idUsuario = (Long)subject.getPrincipal();
			usuario = Usuario.findUsuario(idUsuario);
			subject.getSession().setAttribute(USUARIO_CORRENTE, usuario);
		}
		return usuario;
	}
	
}
