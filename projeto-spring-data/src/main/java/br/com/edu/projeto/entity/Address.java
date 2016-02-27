package br.com.edu.projeto.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address implements Serializable {

	public enum TypeAddress{
		COMERCIAL, RESIDENCIAL
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String city;
	
	private String street;
	
	@Enumerated(EnumType.STRING)
	private TypeAddress type;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(
			name="persons_addresses" , 
			joinColumns = @JoinColumn(name="address_id" , referencedColumnName="id") ,
			inverseJoinColumns = @JoinColumn(name="person_id", referencedColumnName="id")
			)
	List<Person> persons;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public TypeAddress getType() {
		return type;
	}

	public void setType(TypeAddress type) {
		this.type = type;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Address(String city, String street, TypeAddress type) {
		super();
		this.city = city;
		this.street = street;
		this.type = type;
	}
	
	public Address() {
	
	}
	
	
}
