package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.persistence.Staff;
import tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

public class TestFindStaff {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");
		Staff staff2 = staffServicesRemote.findStaffById(2);
		System.out.println("First name: " + staff2.getFirstName());
		System.out.println("Last name: " + staff2.getLastName());
		System.out.println("Date of birth: " + staff2.getBirthday());
		System.out.println("Nationality: " + staff2.getNationality());
		System.out.println("Gender: " + staff2.getGender());
		System.out.println("Role: " + staff2.getRole());
		System.out.println("Email: " + staff2.getEmail());
		System.out.println("Password: " + staff2.getPassword());
		System.out.println("jours de congé annuel permis: " + staff2.getNbjCAR());
		System.out.println("jours de congé maladie permis: " + staff2.getNbjCMAR());

	}
}
