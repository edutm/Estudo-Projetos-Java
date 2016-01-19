package br.com.agenda.ocio.tests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.agenda.ocio.dao.UsuarioDAO;
import br.com.agenda.ocio.dao.UsuarioDAOImpl;
import br.com.agenda.ocio.model.Usuario;
import br.com.agenda.ocio.util.JPAUtil;
import junit.framework.Assert;

public class UsuarioDaoTest {
	
	private UsuarioDAO dao;
	
	@Before
	public void init(){
		dao = new UsuarioDAOImpl();
	}
	@Test
	public void testaCadastro(){
		Usuario u = new Usuario();
		u.setNome("teste");
		u.setSenha("teste");
		u.setUsuario("teste");
	
		Usuario usuario = dao.cadastrar(u);
		Assert.assertNotNull(usuario);
		
	}
	
	@Test
	public void testaBuscarTodos(){
		
	
		List<Usuario> list = dao.getAll();
		Assert.assertNotNull(list);
		
	}

}
