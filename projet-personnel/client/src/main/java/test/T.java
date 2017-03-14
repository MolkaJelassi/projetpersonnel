package test;

import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.services.crud.HolidayServiceRemote;

public class T {
	public static void main(String[] args) throws NamingException, ParseException {
		Context context = new InitialContext();
		HolidayServiceRemote holidayServiceRemote = (HolidayServiceRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/HolidayService!tn.esprit.beautifulminds.services.crud.HolidayServiceRemote");

		holidayServiceRemote.findAllHolidaysPerPerson(2);
	}
}
