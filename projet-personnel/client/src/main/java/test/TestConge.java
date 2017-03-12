package test;

import java.text.ParseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.services.other.congeServiceRemote;

public class TestConge {
	public static void main(String[] args) throws NamingException, ParseException {
		Context context = new InitialContext();
		congeServiceRemote CongeServiceRemote = (congeServiceRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/congeService!tn.esprit.beautifulminds.services.other.congeServiceRemote");

		System.out.println(CongeServiceRemote.getCar(2, 6));

	}
}
