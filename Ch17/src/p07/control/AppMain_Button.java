package p07.control;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain_Button extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("root_Button.fxml"));
		Scene scene = new Scene(root);

		primaryStage.setTitle("외출준비");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
