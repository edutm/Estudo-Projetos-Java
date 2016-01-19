package br.com.agenda.ocio.service;

import java.util.List;

import br.com.agenda.ocio.dto.UsuarioDTO;
import br.com.agenda.ocio.exception.ServicoException;

public interface UsuarioService {
	
	public List<UsuarioDTO> getUsuarios() throws ServicoException;
	
	public UsuarioDTO getUsuario(Integer id);

}
