package br.com.edu.projeto;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import br.com.edu.projeto.entity.Address;
import br.com.edu.projeto.entity.Address.TypeAddress;
import br.com.edu.projeto.entity.Document;
import br.com.edu.projeto.entity.Person;
import br.com.edu.projeto.entity.Phone;
import br.com.edu.projeto.entity.Phone.TypePhone;
import br.com.edu.projeto.repository.AddressRepository;
import br.com.edu.projeto.repository.DocumentRepository;
import br.com.edu.projeto.repository.PersonRepository;
import br.com.edu.projeto.repository.PhoneRepository;

@SpringBootApplication
//@ImportResource(value="spring-data.xml")
public class ProjetoSpringDataApplication implements CommandLineRunner{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringDataApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
//		long count = personRepository.count();
//		System.out.println(count);
		//addPeron();
		//addPersonsLot();
		//deleteLotPerson();
		//testFindBySort();
		//testeFindById();
		//testExists();
		//testPagination();
		testQuery();
	}
	
	public void testQuery(){
		List<Person> list = personRepository.findByFirstName("ed");
		list.forEach(System.out::println);
	}
	
	public void testPagination(){
		
		
		Page<Person> pages = personRepository.findAll(new PageRequest(0, 1));
		List<Person> list = pages.getContent();
		list.forEach(System.out::println);
		
		pages = personRepository.findAll(new PageRequest(1, 1));
		list = pages.getContent();
		list.forEach(System.out::println);
		
		pages = personRepository.findAll(new PageRequest(2, 1));
		list = pages.getContent();
		list.forEach(System.out::println);
	}
	
	public void testExists(){
		boolean exists = personRepository.exists(1L);
		System.out.println(exists);
	}
	
	public void testeFindById(){
		List<Person> list = personRepository.findAll(Arrays.asList(2L, 3L));
		list.forEach(System.out::println);
	}
	
	//consulta ordenada
	public void testFindBySort(){
		//pode ter varios order dentro do contrutor do Sort
		Order order = new Order(Direction.DESC, "firstName");
		Sort sort = new Sort(order);
		List<Person> list = personRepository.findAll(sort);
		list.forEach(System.out::println);
	}
	
	public void deleteLotPerson(){
		Person p = personRepository.findOne(5L);
		Person p2 = personRepository.findOne(4L);
		List<Person> list = Arrays.asList(p, p2);
		
		//delete  passando lista remove executando transações para cada elemento
		//delete batch faz tudo em uma transacao apenas
		personRepository.deleteInBatch(list);
	}
	
	public void addPersonsLot(){
		Person p = new Person();
		p.setFirstName("qqq");
		p.setLastName("qqq");
		p.setAge(28);
		p.setDocument(new Document("22232", 2233));
		
		Person p2 = new Person();
		p2.setFirstName("hhh");
		p2.setLastName("hhh");
		p2.setAge(28);
		p2.setDocument(new Document("56663", 56446));
		
		Person p3 = new Person();
		p3.setFirstName("kjll");
		p3.setLastName("lll");
		p3.setAge(28);
		p3.setDocument(new Document("5463377", 56465));
		
		List<Person> list = Arrays.asList(p, p2, p3);
		personRepository.save(list);
	}
	
	public void addPeron(){
		Person p = new Person();
		p.setFirstName("tesss");
		p.setLastName("tesdf");
		p.setAge(28);
		p.setDocument(new Document("54633", 5646));
		
		Address a = new Address();
		a.setCity("fds");
		a.setType(TypeAddress.COMERCIAL);
		a.setStreet("4");
		
		p.setAddresses(Arrays.asList(a));
		p.addPhone(new Phone("6544", TypePhone.CELULAR));
		
		personRepository.save(p);
	}
}
