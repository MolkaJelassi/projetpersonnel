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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tn.esprit.beautifulminds.persistence.Training;
import tn.esprit.beautifulminds.services.crud.TrainingservicesRemote;

public class AddtrainingController {

	@FXML
	private TextField na;

	@FXML
	private TextField cap;

	@FXML
	private TextField cat;

	@FXML
	private TextField hb;

	@FXML
	private TextField dd;

	@FXML
	private TextField dh;

	@FXML
	private TextField fe;

	@FXML
	private TextField tr;

	@FXML
	private TextField ty;

	@FXML
	private TextField st;

	@FXML
	private Button returnt;

	@FXML
	private Button addt;
	@FXML
	private DatePicker date;

	@FXML
	void clickbuttonAddB(ActionEvent event) {
		Context context;
		try {
			context = new InitialContext();

			TrainingservicesRemote trainingservicesRemote = (TrainingservicesRemote) context.lookup(
					"/projet-personnel-ear/projet-personnel-ejb/Trainingservices!tn.esprit.beautifulminds.services.crud.TrainingservicesRemote");
			String name = na.getText();
			Integer capacity = Integer.parseInt(cap.getText());
			String categorie = cat.getText();

			// Date dateBegin=date.;
			Integer durationDay = Integer.parseInt(dd.getText());
			Integer durationHour = Integer.parseInt(dh.getText());
			Float fees = Float.parseFloat(fe.getText());
			Integer hourBegin = Integer.parseInt(hb.getText());
			String trainer = tr.getText();
			String type = ty.getText();
			// Integer station = Integer.parseInt(st.getText());
			Training T = new Training(name, type, categorie, null, hourBegin, durationDay, durationHour, trainer, fees,
					capacity);
			trainingservicesRemote.addTraining(T);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void clickbuttonReturnT(ActionEvent event) {

		Stage stage = new Stage();
		try {
			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("TrainingsView.fxml")));
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
