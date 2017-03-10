package interfacesMolka;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PersonInterface extends Application {
	@FXML
	private TextArea textfiled1;

	@FXML
	private Button button1;
	private String message;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Stage stage = new Stage();
		stage.setTitle("Management of  the staff");
		Parent root = FXMLLoader.load(getClass().getResource("PersonViewf.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	public void clickbutton(ActionEvent event) {

		message = textfiled1.getText();
		JOptionPane.showMessageDialog(null, message);
		System.out.println(message);
	}
}
