package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse extends Location implements Serializable {
private WarehouseType type ;
private int capacity;
private ArrayList<Vehicle> vehicles;
   //methods
    public boolean isFull(){return false;};
    public float calculateUtilization(){return 0;} ;
    public void addShipment(Shipment shipment){
        ArrayList<Vehicle> vehiclesFromShipment = shipment.getVehicles();
        vehicles.addAll(vehiclesFromShipment);
    }
}
