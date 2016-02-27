package br.com.edu.revjpa.dao;

import br.com.edu.revjpa.entity.Address;

public class AddressDAO extends GenericDAO<Address> {

	public AddressDAO(){
		super(Address.class);
	}
}
