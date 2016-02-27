package br.com.edu.revjpa.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(
	name = "persons",
	indexes = {@Index(columnList="firstName, lastName", unique=true)}
)
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false, length=30)
	private String firstName;
	
	@Column(nullable=false, length=30)
	private String lastName;
	
	private Integer age;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="documentId")
	private Document document;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="person")
	private List<Phone> phones;
	
	@ManyToMany(fetch= FetchType.EAGER)
	@JoinTable(
			name="persons_addresses",
			joinColumns=@JoinColumn(name="personId", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="addressId", referencedColumnName="id")
			)
	
	private List<Address> addresses;
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	private void deletePhone(Phone phone){
		if(phones != null){
			phones.remove(phone);
		}
	}
	
	public void addPhone(Phone phone){
		if(phones == null){
			phones = new ArrayList<Phone>();
		}
		phone.setPerson(this);
		phones.add(phone);
	}
	public Document getDocument() {
		return document;
	}
	
	public void setDocument(Document document) {
		this.document = document;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}
