package com.ndd.quizappv2;

import com.ndd.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManager(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }    
}

