package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;
import java.util.ArrayList;

public class AssignVehiclesToShowroomViewController
{
    @javafx.fxml.FXML
    private ComboBox<FloorPlan> selectFloorPlanComboBox;
    @javafx.fxml.FXML
    private ComboBox<ShowroomSlot> selectShowroomSlotComboBox;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleNameCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, LocalDate> vehicleYearCol;
    @javafx.fxml.FXML
    private ComboBox<Vehicle> selectVehivleComboBox;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Integer> vehicelGradeCOl;
    @javafx.fxml.FXML
    private ComboBox<Showroom> selectShowroomComboBox;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Float> vehiclePriceCol;
    @javafx.fxml.FXML
    private TableView<Vehicle> selectedVehicleTableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Warehouse> vehicleStorageLoactionCol;

    ArrayList<FloorPlan> floorPlans= new ArrayList<>();
    InventoryManager inventoryManager = new InventoryManager();
    ArrayList<Vehicle> vehiclesAfterRepair = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        for (Vehicle v : vehiclesAfterRepair){
            selectVehivleComboBox.getItems().add(v);
        }
    }

    @javafx.fxml.FXML
    public void seeAvailableVehiclesInSHowroomOnActionBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignVehicleToSHowroomOnActionBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showSelectedCarDetailsInTableONAction(ActionEvent actionEvent) {
    }
}