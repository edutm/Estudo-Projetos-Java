package br.com.edu.revjpa.dao;

import java.util.List;

import br.com.edu.revjpa.entity.Person;

public class PersonDAO extends GenericDAO<Person> {

	public PersonDAO(){
		super(Person.class);
	}
	
	public List<Person> findByLastName(String lastName){
		String jpql = "from Person p where p.lastName like ?";
		List<Person> list = find(jpql, lastName);
		return list;
	}
	
	public List<Person> findByAge(Integer min, Integer max){
		String jpql = "from Person p where p.age between ? and ?";
		List<Person> list = find(jpql, min, max);
		return list;
	}
	
	public List<Person> findByFullName(String firstName, String lastName){
		String jpql = "from Person p where p.firstName like ? and p.lastName like ?";
		List<Person> list = find(jpql, firstName, lastName);
		return list;
	}
	
	public  Person findByCpf(String cpf){
		String jpql = "select p from Person p, Document d where d.cpf like ? "
				+ "and p.document.id = d.id";
		return findOne(jpql, cpf);
	}
}
