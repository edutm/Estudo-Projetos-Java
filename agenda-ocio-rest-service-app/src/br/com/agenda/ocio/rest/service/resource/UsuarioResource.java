package br.com.agenda.ocio.rest.service.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.agenda.ocio.dao.UsuarioDAO;
import br.com.agenda.ocio.dao.UsuarioDAOImpl;
import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.rest.service.dto.UsuarioDTO;
import br.com.agenda.ocio.rest.service.exceptions.UsuariosApiExcpetion;
import br.com.agenda.ocio.rest.service.mapper.UsuarioMapper;

@Path("usuarios")
public class UsuarioResource {

	private UsuarioDAO usuarioDAO;
	
	public UsuarioResource(){
		usuarioDAO = new UsuarioDAOImpl();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuarios(){
		
		List<Usuario> lista = usuarioDAO.getAll();
		
		List<UsuarioDTO> listaDTO = new ArrayList<UsuarioDTO>();
		for (Usuario u : lista) {
			UsuarioDTO dto = UsuarioMapper.from(u);
			listaDTO.add(dto);
		}
		return Response.ok(listaDTO).build();
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuario(@PathParam(value="id")Integer id) throws UsuariosApiExcpetion{

		Usuario usuario = usuarioDAO.getUsuario(id);
		if(usuario == null){
			return Response.status(Status.BAD_REQUEST).build();
		}
		UsuarioDTO dto = UsuarioMapper.from(usuario);
		
		return Response.ok(dto).build();
	}
}
