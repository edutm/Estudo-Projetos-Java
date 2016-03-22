package br.com.edu.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;

import br.com.edu.blog.entity.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	public Postagem findByPermalink(String permalink);

	public List<Postagem> findByCategoriasPermalink(String link);

	public List<Postagem> findByAutorNome(String autor);

}
