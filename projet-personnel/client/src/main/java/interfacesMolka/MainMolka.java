package interfacesMolka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMolka extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("Management of trainings");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("TrainingsView.fxml")));
		stage.setScene(scene);
		stage.show();
	}

}
