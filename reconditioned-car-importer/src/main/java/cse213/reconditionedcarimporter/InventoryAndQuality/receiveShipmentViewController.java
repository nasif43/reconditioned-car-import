package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class receiveShipmentViewController
{
    @javafx.fxml.FXML
    private Label shipmentDateLabel;
    @javafx.fxml.FXML
    private Label shipmentOriginLabel;
    @javafx.fxml.FXML
    private Label shipmentStatusLabel;
    @javafx.fxml.FXML
    private Label shipmentIdNumberLabel;
    @javafx.fxml.FXML
    private Label shipmentCarrierLabel;
    @javafx.fxml.FXML
    private ComboBox<Warehouse> selectWHComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    private InventoryManager im = new InventoryManager();
    ArrayList<Shipment> shipments = new ArrayList<>();
    ArrayList<Warehouse> warehouses = new ArrayList<>();
    private Shipment selectedShipment;
    private InventoryManager inventoryManager;

    @javafx.fxml.FXML
    public void initialize() {
        messageLabel.setVisible(false);}}

    //public void receiveShipment(Shipment shipment, Warehouse storageLocation){
    //        shipment.setStatus("ARRIVED_UNCHECKED");
    //        shipment.setStorageLocation(storageLocation);
    //        shipment.setArrivalDate(LocalDate.now());
    //        for (Vehicle v : shipment.getVehicles()){
    //          v.setStatus("AWAITING_INSPECTION");
    //        }
    //        storageLocation.addShipment(shipment);
    //        //add file code in ocntroler
    //String shipmentId, ArrayList<Vehicle> vehicles, String origin,
    // String destination, LocalDate departureDate, LocalDate arrivalDate, String status,
    // String carrier, Warehouse storageLocation)
//    @javafx.fxml.FXML
//    public void receiveShipmentOnActionButton(ActionEvent actionEvent) {
//        Shipment currentShipment = new Shipment();
//        im.receiveShipment(
//
//        );
//    }


