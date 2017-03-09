package tn.esprit.beautifulminds.services.crud;

import java.util.List;

import javax.ejb.Stateless;

import tn.esprit.beautifulminds.persistence.Person;

/**
 * Session Bean implementation class PersonServices
 */
@Stateless
public class PersonServices implements PersonServicesRemote, PersonServicesLocal {

	/**
	 * Default constructor.
	 */
	public PersonServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPerson(Person Person) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person findPersonById(Integer idPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePerson(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Person> findAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
