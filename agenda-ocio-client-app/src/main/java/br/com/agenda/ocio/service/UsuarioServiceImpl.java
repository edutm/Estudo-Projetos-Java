package br.com.agenda.ocio.service;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.agenda.ocio.dto.UsuarioDTO;
import br.com.agenda.ocio.exception.ServicoException;
import br.com.agenda.ocio.webtarget.WebTargetFactory;

@Component
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private WebTargetFactory targetFactory;
	
	public List<UsuarioDTO> getUsuarios() throws ServicoException {
		
		WebTarget target = targetFactory.getWebTarget();
		
		Response response = target.path("usuarios").request().get();
		
		if(response.getStatus() == 200){
			return (List<UsuarioDTO>)response.readEntity(new GenericType<List<UsuarioDTO>>(){});
		} else {
			throw new ServicoException("falha ao chamar serviço");
		}
		
	}

	public UsuarioDTO getUsuario(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
