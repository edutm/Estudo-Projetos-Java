package br.com.agenda.ocio.service;

import java.util.List;

import br.com.agenda.ocio.dto.EventoDTO;
import br.com.agenda.ocio.exception.ServicoException;

public interface EventoService {
	
	public List<EventoDTO> getEventos(Integer usuarioId) throws ServicoException;
	
	public EventoDTO atualiza(EventoDTO evento) throws ServicoException;
	
	public EventoDTO cadastrar(EventoDTO evento) throws ServicoException;
	
	public List<EventoDTO> atualizaLista(List<EventoDTO> lista);

	public EventoDTO getEvento(Integer id) throws ServicoException;

}
