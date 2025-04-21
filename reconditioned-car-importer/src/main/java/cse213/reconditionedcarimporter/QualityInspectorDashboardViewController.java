package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.Notification;
import cse213.reconditionedcarimporter.InventoryAndQuality.RepairPlan;
import cse213.reconditionedcarimporter.InventoryAndQuality.Warehouse;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.time.LocalDate;

public class QualityInspectorDashboardViewController
{
    @javafx.fxml.FXML
    private TableColumn<RepairPlan, LocalDate> RepairPlanDaedlineCol;
    @javafx.fxml.FXML
    private Label eroromessage;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Integer> vehicleYearColAwaitingInspection;
    @javafx.fxml.FXML
    private TableColumn<RepairPlan, String> RepairPlanId;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleIdColAwaitingInspection;
    @javafx.fxml.FXML
    private TableView<Vehicle> needRepairTableView;
    @javafx.fxml.FXML
    private Tab awaiitngInspectionTab;
    @javafx.fxml.FXML
    private TableView<RepairPlan> repairPlanTableView;
    @javafx.fxml.FXML
    private Tab notificationsTab;
    @javafx.fxml.FXML
    private TableView<Notification> notificationTableView;
    @javafx.fxml.FXML
    private BorderPane QIDashBoardBorderPane;
    @javafx.fxml.FXML
    private TableColumn<RepairPlan, String> vehicleNameColRepairPlan;
    @javafx.fxml.FXML
    private TableView<Vehicle> awaitingInspectionTableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleModelColAwaitingInspection;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleMakeColAwaitingInspection;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleIdColRepair;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Integer> vehicleGradeColRepair;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> notificationsBArCol;
    @javafx.fxml.FXML
    private Tab activeRepairsTab;
    @javafx.fxml.FXML
    private Tab vehiclesNeededRepairTab;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Warehouse> vehicleWHColAwaitingInspection;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleNameColRepair;
    @javafx.fxml.FXML
    private TableColumn<RepairPlan, String> rapirPlanSatusColRepairPlan;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> notificationsTypeCol1;
    @javafx.fxml.FXML
    private TableColumn<Notification, Boolean> notificationsIsReadCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void initialInspectionMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatereportMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void partRequestsMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createRepairPlanMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveRepairMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reportnewDamageMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadDashboardMenuItem(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createRepairplanBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showRepairDetailsBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void isnpectSelectedVehicleBtnOnaction(ActionEvent actionEvent) {
    }
}