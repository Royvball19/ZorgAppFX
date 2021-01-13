package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;
import nl.royvball19.zorgappfx.Program;

import java.net.URL;
import java.util.ResourceBundle;

public class AnchorController implements Initializable {

    @FXML
    Button closeApplicationButton;

    @FXML
    public void closeApplicationButtonListener(ActionEvent event) {
        Stage stage = (Stage) closeApplicationButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
