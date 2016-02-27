package br.com.edu.revjpa;

import java.util.List;

import br.com.edu.revjpa.dao.PersonDAO;
import br.com.edu.revjpa.dao.PhoneDAO;
import br.com.edu.revjpa.entity.Document;
import br.com.edu.revjpa.entity.Person;
import br.com.edu.revjpa.entity.Phone;
import br.com.edu.revjpa.entity.Phone.TypePhone;

/**
 * Hello world!
 *
 */
public class App{
    
	public static void main( String[] args ){
        //insertPersons();
		//findById();
		//findAllPerson();
		//count();
		//findByLastName();
		//findByAge();
		//findByFullNAme();
		//update();
		//delete();
		//cadastrarCPF();
		//fingByCpg();
		cadastrarPhone();
    }
	
	public static void fingByCpg(){
		System.out.println(new PersonDAO().findByCpf("22 333"));
	}
	
	public static void cadastrarPhone(){
		Person p = new Person();
		p.setFirstName("Fofa");
		p.setLastName("Xexelenta");
		p.setAge(32);
		p.setDocument(new Document("22", 3132));
		
		Phone f = new Phone("54", TypePhone.CELULAR);
		f.setPerson(p);
		
		new PhoneDAO().save(f);
		
	}
	
	public static void cadastrarCPF(){
		Person p1 = new Person();
		p1.setFirstName("Momo");
		p1.setLastName("zuke");
		p1.setAge(35);
		
		Document d = new Document("22333", 222233);
		p1.setDocument(d);
		
		new PersonDAO().save(p1);
	}
	
	public static void update(){
		Person person = new PersonDAO().findById(1L);
		System.out.println(person);
		person.setLastName("Teixeira Monteiro");
		new PersonDAO().update(person);
		Person person2 = new PersonDAO().findById(1L);
		System.out.println(person2);
		
	}
	
	public static void delete(){
		new PersonDAO().remove(3L);
	}
	
	public static void findByLastName(){
		List<Person> list = new PersonDAO().findByLastName("Teixeira");
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	public static void findByFullNAme(){
		List<Person> list = new PersonDAO().findByFullName("Eduardo", "Teixeira");
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	public static void findByAge(){
		List<Person> list = new PersonDAO().findByAge(25, 35);
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	public static void findById(){
		PersonDAO dao = new PersonDAO();
		Person person = dao.findById(1L);
		System.out.println(person);
	}
	
	public static void findAllPerson(){
		List<Person> findAll = new PersonDAO().findAll();
		for (Person person : findAll) {
			System.out.println(person);
		}
	}
	
	public static void count(){
		Long count = new PersonDAO().count();
		System.out.println(count);
	}

	private static void insertPersons() {
		Person p1 = new Person();
		p1.setFirstName("Eduardo");
		p1.setLastName("Teixeira");
		p1.setAge(29);
		
		Person p2 = new Person();
		p2.setFirstName("Vanessa");
		p2.setLastName("Araujo");
		p2.setAge(30);
		
		Person p3 = new Person();
		p3.setFirstName("Espinosa");
		p3.setLastName("Montenegro");
		p3.setAge(45);
		
		PersonDAO dao = new PersonDAO();
		dao.save(p1);
		dao.save(p2);
		dao.save(p3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
}
