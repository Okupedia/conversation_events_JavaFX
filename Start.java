import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Start extends Application {

    private Scene startScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
	primaryStage.setTitle("test");
	startScene = new Scene(FXMLLoader.load(getClass().getResource("Test.fxml")));
	primaryStage.setScene(startScene);
	primaryStage.setResizable(false);
	primaryStage.show();
    }

    public static void main(String args[]) {
	launch(args);
    }
}

