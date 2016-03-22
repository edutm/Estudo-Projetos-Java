package br.com.edu.blog.service;

import java.util.List;

import br.com.edu.blog.entity.Postagem;

public interface PostagemService {

	
	public void salvarOuAtualizar(Postagem postagem);
	
	public Postagem buscarPorId(Long id);
	
	public Postagem buscarPorPermalink(String permalink);
	
	public List<Postagem> buscarTodos();

	public void deletar(Long id);

	public List<Postagem> buscarPorCategoria(String link);

	public List<Postagem> buscarPorAutor(String autor);
}
