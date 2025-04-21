package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AccouintantandTechnician.RepairTask;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RepairTaskController
{

    @javafx.fxml.FXML
    private Button generateontable;
    @javafx.fxml.FXML
    private TextField TaskFXID;
    @javafx.fxml.FXML
    private TextField descriptionFXID;
    @javafx.fxml.FXML
    private TextField beforephotoFXID;
    @javafx.fxml.FXML
    private TextField afterphotoFXID;
    @javafx.fxml.FXML
    private TextField VINFXID;

    @javafx.fxml.FXML
    public void initialize() {
    }
//public RepairTask(String vin, String taskId, String description, String beforephoto, String afterphoto)
    @javafx.fxml.FXML
    public void SetEquipmentsOnAction(ActionEvent actionEvent) {
        RepairTask newRepairTask = new RepairTask(VINFXID.getText(),TaskFXID.getText(), descriptionFXID.getText(), beforephotoFXID.getText(), afterphotoFXID.getText() );
        newRepairTask.saveRepairTask();
    }
}