package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import nl.royvball19.zorgappfx.Program;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class StartScreenController implements Initializable {

    @FXML
    private Button logInButton;

    @FXML
    public void logInButtonListener(ActionEvent event) {
        Program.setPane(1);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
