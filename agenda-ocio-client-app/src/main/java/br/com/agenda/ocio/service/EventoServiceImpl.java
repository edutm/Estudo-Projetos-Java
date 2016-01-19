package br.com.agenda.ocio.service;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.agenda.ocio.dto.EventoDTO;
import br.com.agenda.ocio.exception.ServicoException;
import br.com.agenda.ocio.webtarget.WebTargetFactory;

@Component
public class EventoServiceImpl implements EventoService {

	@Autowired
	private WebTargetFactory targetFactory;

	public List<EventoDTO> getEventos(Integer usuarioId) throws ServicoException {

		Response response = targetFactory.getWebTarget()
										.path("eventos")
										.path("usuario")
										.path(usuarioId.toString())
										.request().get();

		if (response.getStatus() == 200) {
			return response.readEntity(new GenericType<List<EventoDTO>>() {
			});
		} else {
			throw new ServicoException("Erro ao chamar serviço!");
		}
	}

	public EventoDTO atualiza(EventoDTO evento) throws ServicoException {
		Response response = targetFactory.getWebTarget()
										.path("eventos")
										.request()
										.put(Entity.entity(
										evento, 
										MediaType.APPLICATION_JSON));

		if (response.getStatus() == 200) {
			return response.readEntity(new GenericType<EventoDTO>() {
			});
		} else {
			throw new ServicoException("Erro ao chamar serviço!");
		}
	}

	public List<EventoDTO> atualizaLista(List<EventoDTO> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	public EventoDTO cadastrar(EventoDTO evento) throws ServicoException {

		Response response = targetFactory.getWebTarget()
										.path("eventos")
										.request()
										.post(Entity.entity(evento, MediaType.APPLICATION_JSON));

		if (response.getStatus() == 200) {
			return response.readEntity(new GenericType<EventoDTO>() {
			});
		} else {
			throw new ServicoException("Erro ao chamar serviço!");
		}

	}

	public EventoDTO getEvento(Integer id) throws ServicoException {

		Response response = targetFactory.getWebTarget()
				.path("eventos")
				.path(id.toString()).request().get();

		if (response.getStatus() == 200) {
			return response.readEntity(new GenericType<EventoDTO>() {
			});
		} else {
			throw new ServicoException("Erro ao chamar serviço!");
		}
	}

}
