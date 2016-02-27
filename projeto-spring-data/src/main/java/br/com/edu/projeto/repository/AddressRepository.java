package br.com.edu.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edu.projeto.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

	//busca ordenando onde depois do orderBy coloca a coluna e o tipo de ordenacao
	List<Address> findByCityOrderByTypeDesc(String city);

	//busca mesclada
	List<Address> findByCityStartingWithOrStreetEndingWith(String city, String street);
	
	//busca em qualquer parte da string com parametro
	List<Address> findByStreetContaining(String street);
	
	//busca com termino passado parametro
	List<Address> findByStreetEndingWith(String street);
	
	//busca com inicio passado de parametro
	List<Address> fingByCityStartingWith(String city);
}
