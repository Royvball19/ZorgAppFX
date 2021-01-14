package nl.royvball19.zorgappfx.controllers;

import com.mysql.jdbc.PreparedStatement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import nl.royvball19.zorgappfx.Program;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginScreenController implements Initializable
{
    @FXML private GridPane loginGridPane;

    @FXML private Button loginButton;

    @FXML private TextField userNameTextField;
    @FXML private PasswordField passwordField;

    private int currentLoggedUserID;

    private String url = "jdbc:mysql://localhost:3306/zorgapp";
    private String username = "db";
    private String password = "wachtwoord";
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst2;
    ResultSet rs;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        passwordField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    loginMethod();
                }
            }
        });

        userNameTextField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            @Override
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                    loginMethod();
                }
            }
        });
    }

    public void loginMethod() {
        String uname = userNameTextField.getText();
        String pass = passwordField.getText();

        if(uname.equals("") && pass.equals(""))
        {

            JOptionPane.showMessageDialog(null, "Fill in all fields");
        }
        else
        {
            try
            {
                con = DriverManager.getConnection(url, username, password);

                pst = (PreparedStatement) con.prepareStatement("select * from person where userName=? and password=?");

                pst.setString(1, uname);
                pst.setString(2, pass);

                rs = pst.executeQuery();

                if(rs.next())
                {
                    FileWriter myWriter = new FileWriter("src/nl/royvball19/zorgappfx/files/currentLoggedUserID.txt");
                    myWriter.write(String.valueOf(rs.getInt("ID")));
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");

                    Parent MenuAnchor = FXMLLoader.load(Program.class.getResource("fxml/MenuAnchor.fxml"));
                    Scene anchorMenu = new Scene(MenuAnchor);

                    anchorMenu.getStylesheets().addAll(Program.class.getResource("files/style.css").toExternalForm());

                    // This line gets the stage information
                    Stage window = (Stage) loginGridPane.getScene().getWindow();

                    window.setScene(anchorMenu);
                    window.show();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong password or username!");
                    userNameTextField.setText("");
                    passwordField.setText("");
                    userNameTextField.requestFocus();
                }


            } catch (SQLException | IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void loginButtonListener(ActionEvent event) throws IOException
    {
        loginMethod();
    }
}