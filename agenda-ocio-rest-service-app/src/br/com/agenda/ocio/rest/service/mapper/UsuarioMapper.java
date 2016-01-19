package br.com.agenda.ocio.rest.service.mapper;

import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.rest.service.dto.UsuarioDTO;

public class UsuarioMapper {
	
	private UsuarioMapper(){
		
	}
	
	public static UsuarioDTO from(Usuario usuario){
		UsuarioDTO retorno = new UsuarioDTO();
		
		retorno.setId(usuario.getId());
		retorno.setNome(usuario.getNome());
		retorno.setUsuario(usuario.getUsuario());
		
		return retorno;
	}


}
