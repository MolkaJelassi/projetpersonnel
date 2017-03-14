package interfacesMolka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMolka extends Application {

	public static Object primaryStage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("Menu");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("GestionView.fxml")));
		stage.setScene(scene);
		stage.show();
	}
	public void goTo(Stage primaryStage) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("Menu");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("GestionView.fxml")));
		stage.setScene(scene);
		stage.show();
	}
}
