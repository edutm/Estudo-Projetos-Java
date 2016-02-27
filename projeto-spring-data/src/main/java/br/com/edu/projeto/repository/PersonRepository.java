package br.com.edu.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.edu.projeto.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	//exemplo parametros nomeados usando vararray 
	@Query("select p from Person p where p.firstName in :names order by p.age asc")
	List<Person> findByFirstNames(@Param("names") String... firstNames);
	
	//exemplo usando jpql e anotation query parametros nomeados
	@Query("select p from Person p where p.age >= :min and p.age <= max")
	List<Person> findByAgeBetweenStartEnd(@Param("min")Integer start, @Param("max")Integer end);
	
	//exemplo usando jpql e anotation query parametros ordenado
	@Query("select p from Person p where p.firstName like ?1")
	List<Person> findByFirstName(String firstName);
	
	//busca por idade maior que paramtro ordenando pelo firstName caso firstName igual oredena pelo lastName
	List<Person> findByAgeGreaterThanOrderByFirstNameAscLastNameAsc(Integer age);
	
	//busca por number via phones mapeado por person
	List<Person> findByPhonesNumberStartingWith(String number);
	
	//busca elemento on a coluna document id nao esta null
	List<Person> findByDocumentIsNotNull();
	
	//busca linha que tem a coluna document id = null
	List<Person> findByDocumentIsNull();
	
	//ignore case das string
	List<Person> findByFirstNameIgnoreCase(String firstName);
	
	//busca baseada em lista de parametros  ou uma collections negando
	List<Person> findByAgeNotIn(Integer... ages);
	
	//busca baseada em lista de parametros  ou uma collections
	List<Person> findByAgeIn(Integer... ages);
	
	//busca por firstName maior que parametro
	public List<Person> findByFirstNameGreaterThan(String firstName);	
	
	//menor que e iqual
	public List<Person> findByAgeLessThanEqual(Integer age);
	
	//maior que e igual
	public List<Person> findByAgeGreaterThanEqual(Integer age);
	
	//menor que
	public List<Person> findByAgeLessThan(Integer age);
	
	//maior que
	public List<Person> findByAgeGreaterThan(Integer age);
	
	public List<Person> findByLastNameAndAgeBetween(String lastName, int min, int max);
	
	public List<Person> findByAgeBetween(int min, int max);
	
	public List<Person> findByAgeOrFirstName(Integer age, String firstName);
	
	public Person findByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Person> findByFirstNameLike(String firstName);
	
	public List<Person> fingByFirstNameNotLike(String firstName);
	
	public List<Person> findByAge(Integer age);
	
	public List<Person> findByAgeNot(Integer age);

}
