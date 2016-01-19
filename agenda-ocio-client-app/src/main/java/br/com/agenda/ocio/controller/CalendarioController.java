package br.com.agenda.ocio.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.agenda.ocio.dto.EventoDTO;
import br.com.agenda.ocio.exception.ServicoException;
import br.com.agenda.ocio.service.EventoService;
import br.com.agenda.ocio.util.DateUtil;

@Controller
public class CalendarioController {

	@Autowired
	private EventoService eventoService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("calendario/{id}")
	public String abriCalendario(final Model model, @PathVariable(value="id") Integer id) throws ServicoException{
		
		List<EventoDTO> eventos = eventoService.getEventos(id);
		model.addAttribute("eventos", eventos);
		
		session.setAttribute("idUsuario", id);
		
		return "calendario";
	}
	
	@RequestMapping("novoEvento")
	public String cadastrar(EventoDTO evento) throws ServicoException{
		
		evento.setDataInicio(
				DateUtil.formatarDataParaServico(evento.getDataInicio()));
		evento.setDataFim(
				DateUtil.formatarDataParaServico(evento.getDataFim()));
		evento.setIdUsuario((Integer)session.getAttribute("idUsuario"));
		EventoDTO dto = eventoService.cadastrar(evento);
		
		return "forward:calendario/"+dto.getIdUsuario();
	}
	
	@RequestMapping(value="evento")
	@ResponseBody
	public EventoDTO getEvento(Integer id) throws ServicoException{
		
		EventoDTO evento = eventoService.getEvento(id);
		evento.setDataInicio(
				DateUtil.formatarDataParaForm(evento.getDataInicio()));
		evento.setDataFim(
				DateUtil.formatarDataParaForm(evento.getDataFim()));
		return evento;
	}
	
	@RequestMapping("editarEvento")
	public String editar(EventoDTO evento) throws ServicoException{
		
		evento.setDataInicio(
				DateUtil.formatarDataParaServico(evento.getDataInicio()));
		evento.setDataFim(
				DateUtil.formatarDataParaServico(evento.getDataFim()));
		evento.setIdUsuario((Integer)session.getAttribute("idUsuario"));
		EventoDTO dto = eventoService.atualiza(evento);
		
		return "forward:calendario/"+dto.getIdUsuario();
	}
}
