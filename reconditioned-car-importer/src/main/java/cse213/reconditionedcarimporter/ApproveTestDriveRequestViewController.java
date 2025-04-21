package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ApproveTestDriveRequestViewController
{
    @javafx.fxml.FXML
    private DatePicker rescheduleDtaePicker;
    @javafx.fxml.FXML
    private TableColumn vehicleNameCol;
    @javafx.fxml.FXML
    private TableView testDriveReqsTableView;
    @javafx.fxml.FXML
    private TableColumn customerNameCol;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TableColumn testDriveSlotCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rescheduleTestDriveDateOnActionBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmTestDriveBtn(ActionEvent actionEvent) {
    }
}