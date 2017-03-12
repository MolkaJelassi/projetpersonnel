package interfacesMolka;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import tn.esprit.beautifulminds.persistence.Staff;
import tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

public class MonCompteController {

	@FXML
	private Label l1;

	@FXML
	private Label l2;

	@FXML
	private Label l3;

	@FXML
	private Label l4;

	@FXML
	private Label l5;

	@FXML
	private Label l6;

	@FXML
	private Label l7;

	@FXML
	private Label l8;

	@FXML
	private Label l9;

	@FXML
	private Label l10;

	public void initialize() {

		try {
			Context context = new InitialContext();
			StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
					"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");
			Staff staff2 = staffServicesRemote.findStaffById(AuthController.getId11());
			// ObservableList<Staff> data = FXCollections
			// .observableArrayList(staffServicesRemote.findStaffById(AuthController.getId11()));

			l1.setText("First name: " + staff2.getFirstName());
			l2.setText("Last name: " + staff2.getLastName());
			l3.setText("Date of birth: " + staff2.getBirthday());
			l4.setText("Nationality: " + staff2.getNationality());
			l5.setText("Gender: " + staff2.getGender());
			l6.setText("Role: " + staff2.getRole());
			l7.setText("Email: " + staff2.getEmail());
			l8.setText("Password: " + staff2.getPassword());
			l9.setText("jours de congé annuel permis: " + staff2.getNbjCAR());
			l10.setText("jours de congé maladie permis: " + staff2.getNbjCMAR());

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	private Button req;

	@FXML
	void Clickreq(ActionEvent event) {
		try {

			Stage stage = new Stage();
			stage.setTitle("Add a Request");

			Scene scene;
			scene = new Scene(FXMLLoader.load(getClass().getResource("HoliAdd.fxml")));
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}