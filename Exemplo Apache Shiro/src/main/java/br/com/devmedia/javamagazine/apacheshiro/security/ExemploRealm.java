package br.com.devmedia.javamagazine.apacheshiro.security;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.dao.EmptyResultDataAccessException;

import br.com.devmedia.javamagazine.apacheshiro.model.bean.Papel;
import br.com.devmedia.javamagazine.apacheshiro.model.bean.Permissao;
import br.com.devmedia.javamagazine.apacheshiro.model.bean.Usuario;

public class ExemploRealm extends AuthorizingRealm {

	@Override
	public boolean supports(AuthenticationToken token) {
		//retorna os token suportados pelo realm ** 
		//nesse caso suporta apenas UsernamePassword token
		//classe ja provida pelo shiro, poderia ser uma clase que implementa AuthenticationToken
		return token instanceof UsernamePasswordToken;
	}
	
	
	/*
	 * Metodo responsavel por autenticar usuario de acordo
	 * com o token passaod
	 * 
	 * */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {


		UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
		Usuario usuario = null;
		
		try{
			usuario = Usuario.findUsuarioByLoginEquals(token.getUsername());
		}catch(EmptyResultDataAccessException e){
			throw new UnknownAccountException();
		}
		
		if(usuario != null){
			
			/*
			 * Caso o usuario seja encontrado retorno uma instancia
			 * de SimpleAuthenticationInfo com id do usuario como principal,
			 * a senha(que sera comparada com a sena pasada) e o salt usado na senha
			 * e o nome do usuario
			 * */
			return new SimpleAuthenticationInfo(
												usuario.getId(), 
												usuario.getSenha(), 
												ByteSource.Util.bytes(Base64.decode(usuario.getSalt())), 
												usuario.getNome()
												);
		}
		
		return null;
	}


	/*
	 * Classe responsavel por retornar os papeis e permissoes dado usuario(previamente logado)
	 * */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		//recupera id do usuario que foi armazenado como principal na autenticação
		Long idUsuario = (Long) principals.getPrimaryPrincipal();
		//recuperando usuario
		Usuario usuario = Usuario.findUsuario(idUsuario);
		
		if(usuario != null){
			
			
			//Criar instancia da AuthorizationInfo
			//que sera preenchido com papeis e permissões do usuario
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			
			//adiciona permissoes associadas diretamente ao usuario
			adicionePermissões(usuario.getPermissoes(), info);
			
			
			//percorres papeis, adicionando papeis a SimpleAuthentication info e adicionano as permissores dos papeis ao usuario
			for (Papel papel : usuario.getPapeis()) {
				adicionePermissões(papel.getPermissoes(), info);
				info.addRole(papel.getNome());
			}
			
			return info;
		}
		
		
		return null;
	}


	/*
	 * Metodo responsavel percorrer permissoes e adiciona a String da permissao no formato que apache shiro espera
	 * */
	private void adicionePermissões(Set<Permissao> set, SimpleAuthorizationInfo info) {
		// TODO Auto-generated method stub
		for (Permissao permissao : set) {
			info.addStringPermission(permissao.getStringPermissao());
		}
	}

}
