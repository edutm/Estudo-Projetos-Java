package br.com.agenda.ocio.rest.service.resource;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.agenda.ocio.dao.EventoDAO;
import br.com.agenda.ocio.dao.EventoDAOImpl;
import br.com.agenda.ocio.dao.UsuarioDAO;
import br.com.agenda.ocio.dao.UsuarioDAOImpl;
import br.com.agenda.ocio.model.Evento;
import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.rest.service.dto.EventoDTO;
import br.com.agenda.ocio.rest.service.mapper.EventoMapper;

@Path("eventos")
public class EventoResource {
	
	EventoDAO eventoDAO = new EventoDAOImpl();
	UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response adicionar(EventoDTO dto){	
		Usuario usuario = usuarioDAO.getUsuario(dto.getIdUsuario());
		Evento evento;
		try {
			evento = EventoMapper.from(dto, usuario);
		} catch (ParseException e) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		eventoDAO.cadastrar(evento);
		
		return Response.ok(EventoMapper.to(evento)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response getEvento(@PathParam(value="id") Integer id){
		
		Evento evento = eventoDAO.getEvento(id);
		EventoDTO dto = EventoMapper.to(evento);
		
		return Response.ok(dto).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("usuario/{id}")
	public Response getEventosUsuario(@PathParam(value="id") Integer id){
		
		Usuario usuario = usuarioDAO.getUsuario(id);
		List<EventoDTO> lista = EventoMapper.from(usuario);
		
		return Response.ok(lista).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response atualizar(EventoDTO dto){	
		Usuario usuario = usuarioDAO.getUsuario(dto.getIdUsuario());
		Evento evento;
		try {
			evento = EventoMapper.from(dto, usuario);
		} catch (ParseException e) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		eventoDAO.editar(evento);
		
		return Response.ok(EventoMapper.to(evento)).build();
	}

}
