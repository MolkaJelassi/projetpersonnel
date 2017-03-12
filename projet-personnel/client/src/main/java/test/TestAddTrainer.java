package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.beautifulminds.persistence.Trainer;
import tn.esprit.beautifulminds.services.crud.TrainerServicesRemote;

public class TestAddTrainer {
	public static void main(String[] args) throws NamingException, ParseException {
		Context context = new InitialContext();
		TrainerServicesRemote trainerServicesRemote = (TrainerServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/TrainerServices!tn.esprit.beautifulminds.services.crud.TrainerServicesRemote");

		String firstName = "molka";
		String lastName = "shark";

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date birthday = format.parse("22-04-1994");

		String nationality = "tunisienne";
		String gender = "male";
		String email = "snake@gmail.com";
		String password = "snake";
		String role = "entreneur glisse";
		Integer nbjCA = 30;
		Integer nbjCM = 30;
		Integer nbjCAR = 30;
		Integer nbjCMAR = 30;
		String expirence = "trois ans de travail dans differents stations";
		String description = "jeune tunisien";
		String categorie = "entreneur des amateurs";
		Integer ratingPoints = null;
		Trainer tr = new Trainer(firstName, lastName, birthday, nationality, gender, email, password, role, nbjCA,
				nbjCAR, nbjCM,  nbjCMAR, expirence, description, categorie, ratingPoints);
		trainerServicesRemote.addTrainer(tr);
	}
}
