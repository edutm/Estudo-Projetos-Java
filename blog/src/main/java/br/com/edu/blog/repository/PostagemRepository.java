package br.com.edu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.blog.entity.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public Postagem findByPermalink(String permalink);
}
