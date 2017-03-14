package interfacesMolka;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GestionController2 {

	@FXML
	private Button tr;

	@FXML
	private Button staff;

	@FXML
	void clicksStaff(ActionEvent event) throws IOException {
		Stage stage = new Stage();
		stage.setTitle("Management of the staff");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("StaffView2.fxml")));

		stage.setScene(scene);

		stage.show();
	}

	@FXML
	void clicktrainer(ActionEvent event) throws IOException {
		Stage stage = new Stage();
		stage.setTitle("Management of the staff");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("TrainerView.fxml")));

		stage.setScene(scene);

		stage.show();
	}

}
