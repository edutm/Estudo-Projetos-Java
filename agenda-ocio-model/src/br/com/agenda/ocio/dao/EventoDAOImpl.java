package br.com.agenda.ocio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.agenda.ocio.model.Evento;
import br.com.agenda.ocio.util.JPAUtil;

public class EventoDAOImpl implements EventoDAO{
	
	private EntityManager em = new JPAUtil().getEntityManager();

	@Override
	public Evento cadastrar(Evento evento) {
		em.getTransaction().begin();
		System.out.println(evento.getDataInicio().getTime());
		em.persist(evento);
		
		em.getTransaction().commit();
		return evento;
	}

	@Override
	public Evento editar(Evento evento) {
		em.getTransaction().begin();
		
		em.merge(evento);
		
		em.getTransaction().commit();
		return evento;
	}

	@Override
	public void deletar(Evento evento) {
		em.getTransaction().begin();
		
		em.remove(evento);
		
		em.getTransaction().commit();
		
	}

	@Override
	public Evento getUsuario(Integer id) {
	
		Evento evento = em.find(Evento.class, id);
		return evento;
	}

	@Override
	public List<Evento> getAll() {
		Query query = em.createNamedQuery("Evento.todos");
		List<Evento> lista = query.getResultList();
		return lista;
	}

	@Override
	public Evento getEvento(Integer id) {

		return em.find(Evento.class, id);
	}

	
}
