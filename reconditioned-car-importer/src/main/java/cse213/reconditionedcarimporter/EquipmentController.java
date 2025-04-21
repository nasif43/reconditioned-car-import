package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Equipment;
import cse213.reconditionedcarimporter.AccouintantandTechnician.RepairTask;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class EquipmentController
{
    @javafx.fxml.FXML
    private TextField NameFXID;
    @javafx.fxml.FXML
    private TextField TypeFXID;
    @javafx.fxml.FXML
    private TextField EquipmentIDFXID;
    @javafx.fxml.FXML
    private TableColumn EquipmentTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn EquipmentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn EquipmentIDTableColumn;
    @javafx.fxml.FXML
    private ComboBox <String> UpdateStatusComboBox;
    @javafx.fxml.FXML
    private TextField FilterEquipmentIDFXID1;
    @javafx.fxml.FXML
    private ComboBox <String> StatusCombobox;
    @javafx.fxml.FXML
    private TableColumn EquipmentNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        StatusCombobox.getItems().addAll("Operational", "faulty", "under maintenance");
        UpdateStatusComboBox.getItems().addAll("Operational", "faulty", "under maintenance");
    }
    //public Equipment(String equipmentId, String name, String type, String status)
    @javafx.fxml.FXML
    public void GenerateEquipmentsOnAction(ActionEvent actionEvent) {
        Equipment newEquipment = new Equipment(EquipmentIDFXID.getText(),NameFXID.getText(), TypeFXID.getText(), StatusCombobox.getItems());
        newEquipment.saveEquipment();
    }

    @javafx.fxml.FXML
    public void FilterEquipmentsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateStatusOnAction(ActionEvent actionEvent) {
    }


}