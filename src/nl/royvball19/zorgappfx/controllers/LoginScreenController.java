package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import nl.royvball19.zorgappfx.Program;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable {

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void loginButtonListener(ActionEvent event) throws IOException {
        Parent MenuAnchor = FXMLLoader.load(Program.class.getResource("fxml/MenuAnchor.fxml"));
        Scene myProfileScene = new Scene(MenuAnchor);

        myProfileScene.getStylesheets().addAll(Program.class.getResource("files/style.css").toExternalForm());

        // This line gets the stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(myProfileScene);
        window.show();
    }
}
