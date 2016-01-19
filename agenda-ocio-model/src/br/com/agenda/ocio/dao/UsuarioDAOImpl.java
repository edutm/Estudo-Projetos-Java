package br.com.agenda.ocio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.util.JPAUtil;

public class UsuarioDAOImpl implements UsuarioDAO{
	
	private EntityManager em = new JPAUtil().getEntityManager();

	@Override
	public Usuario cadastrar(Usuario usuario) {
		em.getTransaction().begin();
		
		em.persist(usuario);
		
		em.getTransaction().commit();
		return usuario;
	}

	@Override
	public Usuario editar(Usuario usuario) {
		em.getTransaction().begin();
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		return usuario;
	}

	@Override
	public void deletar(Usuario usuario) {
		em.getTransaction().begin();
		
		em.remove(usuario);
		
		em.getTransaction().commit();
		
	}

	@Override
	public Usuario getUsuario(Integer id) {
	
		Usuario usuario = em.find(Usuario.class, id);
		return usuario;
	}

	@Override
	public List<Usuario> getAll() {
		Query query = em.createNamedQuery("Usuario.todos");
		List<Usuario> lista = query.getResultList();
		return lista;
	}

	@Override
	public Usuario logar(String usuario, String senha) {
		
		TypedQuery<Usuario> namedQuery = em.createNamedQuery("Usuario.login", Usuario.class);
		namedQuery.setParameter("uUsuario", usuario);
		namedQuery.setParameter("uSenha", usuario);
		
		Usuario retorno = namedQuery.getSingleResult();
		
		return retorno;
	}

	
}
