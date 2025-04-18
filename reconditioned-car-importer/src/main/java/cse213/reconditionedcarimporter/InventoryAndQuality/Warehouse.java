package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public class Warehouse extends Location{
    private ArrayList<Vehicle> vehicles;
    @Override
    public boolean isFull(){
        return vehicles.size().equals(capacity);
    }
    @Override
    public float calculateutilization(){
        if (capacity <= 0)
            return 0;
        else {
        return (vehicles.size() / (float) capacity) * 100;}
    }
    public void addShipment(Shipment shipment){
        ArrayList<Vehicle> vehiclesFromShipment = shipment.getVehicles();
        vehicles.addAll(vehiclesFromShipment);
    }
}
