package interfacesMolka;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tn.esprit.beautifulminds.persistence.Staff;
import tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

public class StaffController {

	@FXML
	private TableView<Staff> tabstaff;

	@FXML
	private TableColumn<Staff, String> firstname;

	@FXML
	private TableColumn<Staff, String> lastname;

	@FXML
	private TableColumn<Staff, String> role;

	@FXML
	private TableColumn<Staff, String> gender;

	@FXML
	private TableColumn<Staff, String> nationality;

	@FXML
	private TableColumn<Staff, String> email;

	@FXML
	private TableColumn<Staff, Integer> nbjCAR;

	@FXML
	private TableColumn<Staff, Integer> nbjCMAR;

	public void initialize() {

		try {
			Context context;
			context = new InitialContext();

			StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
					"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");

			ObservableList<Staff> data = FXCollections.observableArrayList(staffServicesRemote.findAllStaffs());

			firstname.setCellValueFactory(new PropertyValueFactory<Staff, String>("firstName"));
			lastname.setCellValueFactory(new PropertyValueFactory<Staff, String>("lastName"));
			role.setCellValueFactory(new PropertyValueFactory<Staff, String>("role"));
			gender.setCellValueFactory(new PropertyValueFactory<Staff, String>("gender"));
			nationality.setCellValueFactory(new PropertyValueFactory<Staff, String>("nationality"));
			email.setCellValueFactory(new PropertyValueFactory<Staff, String>("email"));
			nbjCAR.setCellValueFactory(new PropertyValueFactory<Staff, Integer>("nbjCAR"));
			nbjCMAR.setCellValueFactory(new PropertyValueFactory<Staff, Integer>("nbjCMAR"));

			tabstaff.setItems(data);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
