package br.com.agenda.ocio.rest.service.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.agenda.ocio.dao.UsuarioDAO;
import br.com.agenda.ocio.dao.UsuarioDAOImpl;
import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.rest.service.dto.LoginDTO;
import br.com.agenda.ocio.rest.service.mapper.UsuarioMapper;

@Path("login")
public class LoginResource {

	private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public Response logar(LoginDTO login){
		
		Usuario usuario = usuarioDAO.logar(login.getUsuario(), login.getSenha());
		
		if(usuario == null){
			return Response.status(Status.BAD_REQUEST).build();
		}
		return Response.ok(UsuarioMapper.from(usuario)).build();
	}
}
