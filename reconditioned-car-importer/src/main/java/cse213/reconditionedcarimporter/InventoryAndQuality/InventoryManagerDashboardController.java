package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.time.LocalDate;

public class InventoryManagerDashboardController
{
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentIdColumn;
    @javafx.fxml.FXML
    private TableView<Notification> notificationsTableView;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,Integer> warehouseVehicleCountCol;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,String> warehouseLocationCol;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,String> warehouseNameCol;
    @javafx.fxml.FXML
    private TableColumn<Shipment,Integer> shipmentVehicleCountColumn;
    @javafx.fxml.FXML
    private BorderPane imDashboardBorderPane;
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<Notification,String> notificationsBarColu;
    @javafx.fxml.FXML
    private Tab notificationsTab;
    @javafx.fxml.FXML
    private Tab shipmentTab;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,Integer> warehouseCapacityCol;
    @javafx.fxml.FXML
    private Tab warehouseTab;
    @javafx.fxml.FXML
    private TableColumn<Shipment,Warehouse> shipmentLoactionColumn;
    @javafx.fxml.FXML
    private TableView<Warehouse> warhousesTableView;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,String> warehouseStatusCol;
    @javafx.fxml.FXML
    private TableColumn<Shipment, LocalDate> arrivalDateColumn;
    @javafx.fxml.FXML
    private TableView<Shipment> shipmentsTabTableView;
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentOriginColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void testDriveRequestMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewPrevReportsMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateIMreportMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void processVehiclePurchaseMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flagAgingVehiclesMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignVehiclesToShowroomMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void seeDashBoardMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadReceiveShipmentViewBTn(ActionEvent actionEvent) {
    }
}