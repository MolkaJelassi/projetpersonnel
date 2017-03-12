package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.persistence.Holiday;
import tn.esprit.beautifulminds.services.crud.HolidayServiceRemote;

public class TestAddHoliday {
	public static void main(String[] args) throws NamingException, ParseException {
		Context context = new InitialContext();
		HolidayServiceRemote holidayServiceRemote = (HolidayServiceRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/HolidayService!tn.esprit.beautifulminds.services.crud.HolidayServiceRemote");

		Integer personId = 2;
		Date dateDemande = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date dateDepart = format.parse("12-04-2017");
		Integer nbrjour = 5;
		Boolean etat = false;
		Holiday h = new Holiday(personId, dateDemande, dateDepart, nbrjour, etat);
		holidayServiceRemote.addHoliday(h);
		;
	}
}
