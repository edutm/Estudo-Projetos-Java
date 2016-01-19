package br.com.agenda.ocio.dao;

import java.util.List;

import br.com.agenda.ocio.model.Evento;

public interface EventoDAO {
	
	public Evento cadastrar(Evento evento);
	
	public Evento editar(Evento evento);
	
	public void deletar(Evento evento);
	
	public Evento getUsuario(Integer id);
	
	public List<Evento> getAll();
	
	public Evento getEvento(Integer id);

}
