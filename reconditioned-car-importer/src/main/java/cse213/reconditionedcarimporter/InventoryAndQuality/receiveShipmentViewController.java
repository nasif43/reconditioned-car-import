package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class receiveShipmentViewController
{
    @javafx.fxml.FXML
    private Label ShipmentIdNumber;



    @javafx.fxml.FXML
    public void receiveShipmentOnActionButton(ActionEvent actionEvent) {
   // InventoryManager.receiveShipment(currentShipment,warehouse);
    //System.out.println(InventoryManager.getNotifications());
        System.out.println(shipmentIdFromView);
    }



        }