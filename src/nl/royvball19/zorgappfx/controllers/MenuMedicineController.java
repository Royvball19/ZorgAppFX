package nl.royvball19.zorgappfx.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import nl.royvball19.zorgappfx.model.Medicine;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuMedicineController implements Initializable
{

    @FXML private TableView<Medicine> medicinesTableView;

    @FXML private TableColumn<Medicine, String> medicineNameColumn;
    @FXML private TableColumn<Medicine, String> medicineDescriptionColumn;
    @FXML private TableColumn<Medicine, String> medicineTypeColumn;
    @FXML private TableColumn<Medicine, Integer> medicineDoseColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        medicineNameColumn.setCellValueFactory( new PropertyValueFactory<>("name"));
        medicineDescriptionColumn.setCellValueFactory( new PropertyValueFactory<>("description"));
        medicineTypeColumn.setCellValueFactory( new PropertyValueFactory<>("type"));
        medicineDoseColumn.setCellValueFactory( new PropertyValueFactory<>("dose"));


        Medicine medicine = new Medicine(1, "Paracetemol", "Tegen hoofdpijn", "Tablet", 10);
        Medicine medicine2 = new Medicine(2, "Ibubrofen", "Tegen hoofdpijn", "Tablet", 30);
        medicinesTableView.getItems().addAll(medicine, medicine2);
    }
}
