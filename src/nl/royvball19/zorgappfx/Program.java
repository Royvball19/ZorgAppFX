package nl.royvball19.zorgappfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Program extends Application
{

    // Attributes
    private static AnchorPane root;
    private static List<GridPane> grid = new ArrayList<>();
    private static int currentIndex = 0;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        try
        {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("fxml/Anchor.fxml"));

            grid.add((GridPane) FXMLLoader.load(getClass().getResource("fxml/StartScreen.fxml")));
            grid.add((GridPane) FXMLLoader.load(getClass().getResource("fxml/LoginScreen.fxml")));

            root.getChildren().add(grid.get(0));
            Scene scene = new Scene(root, 300, 400);
            primaryStage.setResizable(false);
            primaryStage.getIcons().add(new Image("https://image.flaticon.com/icons/png/512/250/250518.png"));
            scene.getStylesheets().add(getClass().getResource("files/style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static GridPane getPane(int index)
    {
        return grid.get(index);
    }

    public static void setPane(int index)
    {
        root.getChildren().remove(grid.get(currentIndex));
        root.getChildren().add(grid.get(index));
        currentIndex = index;
    }

    public static void main(String[] args)
    {
        System.out.println("Loading driver...");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!\n");
        } catch (ClassNotFoundException e)
        {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        launch(args);
    }
}
