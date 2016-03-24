package br.com.edu.blog.service;

import java.util.List;

import br.com.edu.blog.entity.Categoria;

public interface CategoriaService {

	
	public void salvar(Categoria categoria);
	
	public void deletar(Long id);
	
	public Categoria buscarPorId(Long id);
	
	public Categoria buscarPorCategoria(String categoria);
	
	public List<Categoria> buscarTodos();
}
