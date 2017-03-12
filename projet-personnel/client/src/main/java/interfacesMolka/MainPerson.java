package interfacesMolka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPerson extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("S'authentifier");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Authent.fxml")));
		stage.setScene(scene);
		stage.show();
	}

}
