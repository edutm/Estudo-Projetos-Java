package br.com.agenda.ocio.dao;

import java.util.List;

import br.com.agenda.ocio.model.Usuario;

public interface UsuarioDAO {
	
	public Usuario cadastrar(Usuario usuario);
	
	public Usuario editar(Usuario usuario);
	
	public void deletar(Usuario usuario);
	
	public Usuario getUsuario(Integer id);
	
	public List<Usuario> getAll();
	
	public Usuario logar(String usuario, String senha);

}
