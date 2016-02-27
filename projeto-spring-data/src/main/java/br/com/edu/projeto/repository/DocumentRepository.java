package br.com.edu.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.projeto.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
