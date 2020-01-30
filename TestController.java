import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class TestController {
    private int i;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label textLabel;

    @FXML
    private Button button;

    @FXML
    void buttonOnAction(ActionEvent event) {
        showText("ボタンが押されました");
    }

    void showPerText(String showText, int i){
        textLabel.setText(showText.substring(0, i));
    }

    void showText(String showText){
        i = 0;
        Timeline timeline = new Timeline(
                new KeyFrame(
                        new Duration(100),
		    /*
		       new EventHandler<ActionEvent>(){
		       @Override
		       public void handle(ActionEvent event){
		       i+=1;
		       showPerText(showText, i);
		       }
		       }
		       */
                        (event) -> {
                            i+=1;
                            showPerText(showText, i);
                        }
                )
        );
        timeline.setCycleCount(showText.length());
        timeline.play();
    }

    @FXML
    void initialize() {
        assert textLabel != null : "fx:id=\"textLabel\" was not injected: check your FXML file 'Test.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'Test.fxml'.";
        textLabel.setText("ボタンを押してください");

    }
}

