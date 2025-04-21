package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.InventoryReport;
import cse213.reconditionedcarimporter.InventoryAndQuality.Location;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InventoryReportViewController
{
    @javafx.fxml.FXML
    private TableView<InventoryReport> inventoryReportTableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Location> vehicelLocationCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicelIDCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Float> vehicelPriceCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Integer> vehicelGradeCol;
    @javafx.fxml.FXML
    private ComboBox<Location> chooseStorageCOmboBox;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicelNameCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String > vehicelStatusCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateInventpryReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendReportToAcoountantOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void chooseStorageCOmboBoxAction(ActionEvent actionEvent) {
    }
}