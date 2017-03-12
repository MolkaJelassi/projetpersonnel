package interfacesMolka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import tn.esprit.beautifulminds.persistence.Holiday;
import tn.esprit.beautifulminds.services.crud.HolidayServiceRemote;

public class RequestController {

	@FXML
	private AnchorPane holi;

	@FXML
	private DatePicker datepicker;

	@FXML
	private TextField txt;

	@FXML
	private Button valider;

	@FXML
	void clickValide(ActionEvent event) throws ParseException {

		try {
			Context context = new InitialContext();
			HolidayServiceRemote holidayServiceRemote = (HolidayServiceRemote) context.lookup(
					"projet-personnel-ear/projet-personnel-ejb/HolidayService!tn.esprit.beautifulminds.services.crud.HolidayServiceRemote");

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date dateDepart = format.parse("12-04-2017");
			Integer nbrjour = Integer.parseInt(txt.getText());
			Integer personId = AuthController.getId11();
			Date dateDemande = new Date(System.currentTimeMillis());
			Boolean etat = false;

			Holiday h = new Holiday(personId, dateDemande, dateDepart, nbrjour, etat);
			holidayServiceRemote.addHoliday(h);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "wait for a response please!");
	}
}
