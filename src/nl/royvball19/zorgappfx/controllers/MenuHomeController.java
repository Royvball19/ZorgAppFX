package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import nl.royvball19.zorgappfx.Program;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuHomeController implements Initializable
{

    @FXML private Button nextScreenButton;


    @FXML
    public void logOutButtonListener(ActionEvent event) throws Exception
    {
        FileWriter myWriter = new FileWriter("src/nl/royvball19/zorgappfx/files/currentLoggedUserID.txt");
        myWriter.write(("0"));
        myWriter.close();
        Parent LoginScreen = FXMLLoader.load(Program.class.getResource("fxml/LoginScreen.fxml"));
        Scene login = new Scene(LoginScreen);

        login.getStylesheets().addAll(Program.class.getResource("files/style.css").toExternalForm());

        // This line gets the stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(login);
        window.show();
    }

    @FXML
    public void nextScreenListener(ActionEvent event)
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
}
