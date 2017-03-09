package tn.esprit.beautifulminds.services.crud;

import java.util.List;

import javax.ejb.Stateless;

import tn.esprit.beautifulminds.persistence.Staff;

/**
 * Session Bean implementation class StaffServices
 */
@Stateless

public class StaffServices implements StaffServicesRemote, StaffServicesLocal {

	/**
	 * Default constructor.
	 */
	public StaffServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addStaff(Staff staff) {
		// TODO Auto-generated method stub

	}

	@Override
	public Staff findStaffById(Integer idPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStaff(Staff staff) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStaff(Staff staff) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Staff> findAllStaffs() {
		// TODO Auto-generated method stub
		return null;
	}

}
