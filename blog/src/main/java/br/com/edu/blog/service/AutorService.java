package br.com.edu.blog.service;

import java.util.List;

import br.com.edu.blog.entity.Autor;

public interface AutorService {

	public Autor buscarPorId(Long id);
	
	public Autor buscarPorNome(String nome);
	
	public List<Autor> buscarTodos();
	
	public void salvar(Autor autor);
	
	public void deletar(long id);
}
