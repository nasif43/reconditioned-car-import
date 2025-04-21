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
    ArrayList<Shipment> shipments = new ArrayList<>();
    ArrayList<Warehouse> warehouses = new ArrayList<>();
    private Shipment selectedShipment;
    private InventoryManager inventoryManager = new InventoryManager();

    private Shipment shipment;

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
        showShipmentDetails();
    }

    private void showShipmentDetails() {
        if (shipment != null) {
            shipmentIdNumberLabel.setText(shipment.getShipmentId());
            shipmentOriginLabel.setText(shipment.getOrigin());
            shipmentStatusLabel.setText(shipment.getStatus());
        }
    }


    @javafx.fxml.FXML
    public void initialize() {
        messageLabel.setVisible(false);
    // warehouses.add(new Warehouse("Chittagong_WH1"));
    //        warehouses.add(new Warehouse("Dhaka_WH1"));
    //        warehouses.add(new Warehouse("Dhaka_WH2"));
    //        warehouses.add(new Warehouse("Dhaka_WH3"));
    //        warehouses.add(new Warehouse("Dhaka_WH4"));
    selectWHComboBox.getItems().addAll(inventoryManager.warehouses);}



    public InventoryManager getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    @javafx.fxml.FXML
    public void receiveShipmentOnActionButton(ActionEvent actionEvent) {
        Warehouse selectedWarehouse = selectWHComboBox.getSelectionModel().getSelectedItem();
        if (selectedWarehouse != null && shipment != null) {
            shipment.setStatus("ARRIVED_UNCHECKED");
            shipment.setStorageLocation(selectedWarehouse);
            shipment.setArrivalDate(LocalDate.now());
            for (Vehicle v : shipment.getVehicles()) {
                v.setStatus("AWAITING_INSPECTION");
            }
            selectedWarehouse.addShipment(shipment);

            shipment.saveShipment();
            messageLabel.setText("Shipment received successfully!");
            messageLabel.setVisible(true);
        } else {
            messageLabel.setText("Please select a warehouse!");
            messageLabel.setVisible(true);
        }
    }}


