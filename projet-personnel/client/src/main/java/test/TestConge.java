package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.persistence.Staff;
import tn.esprit.beautifulminds.services.other.congeServiceRemote;

public class TestConge {
	public static void main(String[] args) throws NamingException, ParseException {
		Context context = new InitialContext();
		congeServiceRemote CongeServiceRemote = (congeServiceRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/congeService!tn.esprit.beautifulminds.services.other.congeServiceRemote");
		String firstName = "molka";
		String lastName = "shark";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date birthday = format.parse("22-04-1994");
		String nationality = "tunisienne";
		String gender = "male";
		String email = "snake@gmail.com";
		String password = "snake";
		String role = "vendor";
		Integer nbjCA = 30;
		Integer nbjCM = 30;
		Integer nbjCAR = 30;
		Integer nbjCMAR = 30;
		Staff st = new Staff(firstName, lastName, birthday, nationality, gender, email, password, role, nbjCA, nbjCAR,
				nbjCM, nbjCMAR);
		System.out.println(CongeServiceRemote.getCar(st, 5));

	}
}
