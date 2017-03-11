package interfacesMolka;

import java.io.IOException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tn.esprit.beautifulminds.persistence.Training;
import tn.esprit.beautifulminds.services.crud.TrainingservicesRemote;

public class TrainingsController {
	@FXML
	private Button addB;

	@FXML
	private TableView<Training> tabtraining;

	@FXML
	private TableColumn<Training, Integer> idTraining;

	@FXML
	private TableColumn<Training, String> name;

	@FXML
	private TableColumn<Training, Integer> capacity;

	@FXML
	private TableColumn<Training, String> categorie;

	@FXML
	private TableColumn<Training, Date> dateBegin;

	@FXML
	private TableColumn<Training, Integer> durationDay;

	@FXML
	private TableColumn<Training, Integer> durationHour;

	@FXML
	private TableColumn<Training, Float> fees;

	@FXML
	private TableColumn<Training, Integer> hourBegin;

	@FXML
	private TableColumn<Training, String> trainer;

	@FXML
	private TableColumn<Training, String> type;

	@FXML
	private TableColumn<Training, Integer> station;

	public void initialize() {

		try {
			Context context;
			context = new InitialContext();

			TrainingservicesRemote trainingservicesRemote = (TrainingservicesRemote) context.lookup(
					"/projet-personnel-ear/projet-personnel-ejb/Trainingservices!tn.esprit.beautifulminds.services.crud.TrainingservicesRemote");
			// List<Training> T = trainingservicesRemote.findAllTrainings();

			ObservableList<Training> data = FXCollections
					.observableArrayList(trainingservicesRemote.findAllTrainings());

			idTraining.setCellValueFactory(new PropertyValueFactory<Training, Integer>("idTraining"));
			name.setCellValueFactory(new PropertyValueFactory<Training, String>("name"));
			capacity.setCellValueFactory(new PropertyValueFactory<Training, Integer>("capacity"));
			categorie.setCellValueFactory(new PropertyValueFactory<Training, String>("categorie"));
			dateBegin.setCellValueFactory(new PropertyValueFactory<Training, Date>("dateBegin"));
			durationDay.setCellValueFactory(new PropertyValueFactory<Training, Integer>("durationDay"));
			durationHour.setCellValueFactory(new PropertyValueFactory<Training, Integer>("durationHour"));
			fees.setCellValueFactory(new PropertyValueFactory<Training, Float>("fees"));
			hourBegin.setCellValueFactory(new PropertyValueFactory<Training, Integer>("hourBegin"));
			trainer.setCellValueFactory(new PropertyValueFactory<Training, String>("trainer"));
			type.setCellValueFactory(new PropertyValueFactory<Training, String>("type"));
			station.setCellValueFactory(new PropertyValueFactory<Training, Integer>("station"));

			tabtraining.setItems(data);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void clickbuttonB(ActionEvent event) {
		System.out.println("hey");
		Stage stage = new Stage();
		stage.setTitle("Add a training");
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("Trainingsadd.fxml"));

			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
