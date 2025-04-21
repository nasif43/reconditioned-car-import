package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse extends Location implements Serializable {
    private ArrayList<Vehicle> vehicles;

    public Warehouse(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public Warehouse() {
    }

    public Warehouse(String warehouseName) {
    }

    @Override
    public boolean isFull(){
        return vehicles.size()==(capacity);
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

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public int getcurrentCount(){
        return getVehicles().size();
    }
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
