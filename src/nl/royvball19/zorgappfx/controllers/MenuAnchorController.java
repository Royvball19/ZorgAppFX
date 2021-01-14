package nl.royvball19.zorgappfx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import nl.royvball19.zorgappfx.Program;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class MenuAnchorController implements Initializable
{
    private AnchorPane root;

    private List<GridPane> grid = new ArrayList<>();

    private static int currentIndex =0;

    @FXML private AnchorPane menuAnchor;

    @FXML private Button homeButton;
    @FXML private Button medicineButton;
    @FXML private Button weightButton;


    @FXML
    public void homeButtonListener (ActionEvent event) throws IOException {
        setPane(0);
    }

    @FXML
    public void medicineButtonListener (ActionEvent event) throws IOException {
        setPane(1);
    }

    @FXML
    public void weightButtonListener (ActionEvent event) throws IOException {
        setPane(2);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        try
        {
            grid.add((GridPane) FXMLLoader.load(Program.class.getResource("fxml/MenuHome.fxml")));
            grid.add((GridPane)FXMLLoader.load(Program.class.getResource("fxml/MenuMedicine.fxml")));
            grid.add((GridPane)FXMLLoader.load(Program.class.getResource("fxml/MenuWeight.fxml")));

            menuAnchor.getChildren().add(grid.get(0));


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void init_app()
    {
        for (int i =0; i < grid.size(); i++)
        {

        }
    }

    public GridPane getPane(int index)
    {
        return grid.get(index);
    }

    public void setPane(int index)
    {
        menuAnchor.getChildren().remove(grid.get(currentIndex));
        menuAnchor.getChildren().add(grid.get(index));
        currentIndex = index;
    }
}
