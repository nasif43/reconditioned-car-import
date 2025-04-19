package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class receiveShipmentViewController
{
    @javafx.fxml.FXML
    private Label ShipmentIdNumber;

    //dummy shipment

    String shipmentIdFromView;
    @javafx.fxml.FXML
    public void initialize() {
        ShipmentIdNumber.setText("jsnfsjkvn");
        shipmentIdFromView = ShipmentIdNumber.getText();
        Shipment currentShipment = new Shipment(shipmentIdFromView);
        Warehouse warehouse = new Warehouse();

    }
    @javafx.fxml.FXML
    public void receiveShipmentOnActionButton(ActionEvent actionEvent) {
   // InventoryManager.receiveShipment(currentShipment,warehouse);
    //System.out.println(InventoryManager.getNotifications());
        System.out.println(shipmentIdFromView);
    }
}