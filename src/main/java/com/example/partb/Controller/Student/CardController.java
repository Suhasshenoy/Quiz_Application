package com.example.partb.Controller.Student;

import com.example.partb.listeners.NewScreenListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class CardController implements Initializable {
    @FXML private Button cardBtn;
    @FXML private Label noq;
    @FXML private Label quizTitle;
    private NewScreenListener screenListener;

    public void setScreenListener(NewScreenListener screenListener) {
        this.screenListener = screenListener;
    }

    public void setNoq(String val) {
        this.noq.setText(val);
    }
    public void setQuizTitle(String val) {
        this.quizTitle.setText(val);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void startQuiz(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/partb/templates/Student/questionScreen.fxml"));
        try{
            Node node = loader.load();
            this.screenListener.changeScreen(node);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
