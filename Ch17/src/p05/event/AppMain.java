package p05.event;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("root_bootm.fxml"));
		
		Scene s = new Scene(root);
		
		stage.setTitle("AppMain");
		stage.setScene(s);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

	
}

