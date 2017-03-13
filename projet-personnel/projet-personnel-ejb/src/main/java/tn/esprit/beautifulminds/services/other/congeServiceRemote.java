package tn.esprit.beautifulminds.services.other;

import javax.ejb.Remote;

import tn.esprit.beautifulminds.persistence.Person;
import tn.esprit.beautifulminds.persistence.Staff;

@Remote
public interface congeServiceRemote {
	//Person findPersonById(Integer idPerson);

	public Integer getCar(Staff staff, Integer j);
}
