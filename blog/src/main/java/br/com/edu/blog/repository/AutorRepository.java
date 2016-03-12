package br.com.edu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.com.edu.blog.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

	public Autor findByNome(String nome);

	
	@Modifying
	@Query("update Autor a set a.nome=?1, a.biografia=?2 where a.id=?3")
	public void updateNomeEBiografia(String nome, String biografia, Long id);
}
