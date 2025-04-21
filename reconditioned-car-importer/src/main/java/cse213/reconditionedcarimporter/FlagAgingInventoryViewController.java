package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.Showroom;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class FlagAgingInventoryViewController
{
    @javafx.fxml.FXML
    private TableView<Vehicle> agingVehcilestabklView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Integer>  daysInStockCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String>  vehicleShowroomCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleNameCol;
    @javafx.fxml.FXML
    private ComboBox<Integer> filterDaysInStockComboBox;
    @javafx.fxml.FXML
    private Label errorMesage;
    @javafx.fxml.FXML
    private ComboBox<Showroom> selectOutletCOmboBox;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Float> vehiclePriceCol;
    @javafx.fxml.FXML
    private Button discountOnACtionButton;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterDaysInStockOnActionComboBox(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmAgingVehicleBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void moveToOutletBtn(ActionEvent actionEvent) {
    }
}