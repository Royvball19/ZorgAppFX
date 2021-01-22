package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import nl.royvball19.zorgappfx.Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StartScreenController implements Initializable
{

    // Attributes
    private int currentLoggedUserID;

    // FXML Attributes
    @FXML private Button logInButton;
    @FXML private Button closeApplicationButton;

    @FXML
    public void logInButtonListener(ActionEvent event) throws IOException
    {
        try {
            File myObj = new File("src/nl/royvball19/zorgappfx/files/currentLoggedUserID.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                currentLoggedUserID = Integer.parseInt(data);
            }
            myReader.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (currentLoggedUserID == 0) {
            Program.setPane(1);
        } else

        {
            Parent MenuAnchor = FXMLLoader.load(Program.class.getResource("fxml/MenuAnchor.fxml"));
            Scene myProfileScene = new Scene(MenuAnchor);

            myProfileScene.getStylesheets().addAll(Program.class.getResource("files/style.css").toExternalForm());

            // This line gets the stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(myProfileScene);
            window.show();
        }
    }

    @FXML
    public void closeApplicationButtonListener(ActionEvent event)
    {
        Stage stage = (Stage) closeApplicationButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    }
}
