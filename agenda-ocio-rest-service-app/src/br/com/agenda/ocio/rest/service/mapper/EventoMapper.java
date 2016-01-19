package br.com.agenda.ocio.rest.service.mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.ocio.model.Evento;
import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.rest.service.dto.EventoDTO;
import br.com.agenda.ocio.rest.service.util.DateUtil;

public class EventoMapper {
	
	private EventoMapper(){
		
	}
	
	public static Evento from(EventoDTO dto, Usuario usuario) throws ParseException{
		
		Evento evento = new Evento();
		evento.setId(dto.getId());
		evento.setTitulo(dto.getTitulo());
		evento.setDataInicio(DateUtil.from(dto.getDataInicio()));
		evento.setDataFim(DateUtil.from(dto.getDataFim()));
		evento.setDiaTodo(dto.getDiaTodo());
		evento.setUrl(dto.getUrl());
		evento.setUsuario(usuario);
		return evento;
	}
	
	public static EventoDTO to(Evento evento){
		EventoDTO dto = new EventoDTO();
		
		dto.setId(evento.getId());
		dto.setDataInicio(DateUtil.to(evento.getDataInicio()));
		dto.setDataFim(DateUtil.to(evento.getDataFim()));
		dto.setDiaTodo(evento.getDiaTodo());
		dto.setTitulo(evento.getTitulo());
		dto.setUrl(evento.getUrl());
		dto.setIdUsuario(evento.getUsuario().getId());
		
		return dto;
	}
	
	public static List<EventoDTO> from(Usuario usuario){
		
		List<EventoDTO> lista = new ArrayList<EventoDTO>();
		
		for (Evento evento : usuario.getEventos()) {
			lista.add(to(evento));
		}
		return lista;
	}

}
