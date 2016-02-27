package br.com.edu.blog.service;

import java.util.List;

import br.com.edu.blog.entity.Avatar;
import br.com.edu.blog.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> buscarTodos();
	
	public Usuario buscarPorId(Long id);
	
	public Usuario buscarPorEmail(String email);
	
	public Usuario buscarPorAvatar(Avatar avatar);
	
	public void deletar(Long id);
	
	public void salvar(Usuario usuario);

	public void updateNameAndEmail(Usuario usuario);

	public void updateSenha(Usuario usuario);
	

}
