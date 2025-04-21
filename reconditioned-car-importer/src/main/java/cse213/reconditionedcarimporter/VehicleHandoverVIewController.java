package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.Showroom;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class VehicleHandoverVIewController
{
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Integer> vehicleGradeCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> vehicleNameCol;
    @javafx.fxml.FXML
    private ImageView vehicleImage;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Integer> vehicleYearCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Float> vehiclePriceCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Showroom> vehiclSHowroomCol;
    @javafx.fxml.FXML
    private TableView<Vehicle> vehiclesRdyToHandoverTableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String > vehicleIDCol;

    @javafx.fxml.FXML
    public void initialize() {
    }}