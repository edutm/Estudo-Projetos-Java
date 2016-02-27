package br.com.edu.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.projeto.entity.Phone;


public interface PhoneRepository extends JpaRepository<Phone, Long>{

}
