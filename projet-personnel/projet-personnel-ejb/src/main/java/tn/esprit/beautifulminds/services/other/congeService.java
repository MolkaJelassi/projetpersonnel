package tn.esprit.beautifulminds.services.other;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.beautifulminds.persistence.Staff;
import tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

/**
 * Session Bean implementation class congeService
 */
@Stateless

public class congeService implements congeServiceRemote, congeServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public congeService() {
		// TODO Auto-generated constructor stub
	}

	private StaffServicesRemote sr ;


	@Override
	public Integer getCar(Integer id , Integer j) {
		Staff s = sr.findStaffById(id);
		Integer a =s.getNbjCAR();
		return a-j;
	}

}
