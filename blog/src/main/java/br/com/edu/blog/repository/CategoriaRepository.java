package br.com.edu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.blog.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public Categoria findByDescricao(String descricao);
}
