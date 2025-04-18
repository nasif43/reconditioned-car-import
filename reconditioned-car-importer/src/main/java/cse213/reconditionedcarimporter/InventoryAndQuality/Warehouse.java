package cse213.reconditionedcarimporter.InventoryAndQuality;

public abstract class Warehouse extends Location{
    private WarehouseType type ;
    private int capacity;
    private ArrayList<Vehicle> vehicles;

    public boolean isFull(){
        return false;
    }
    public void calculateutilization(){
        return vehicles.size().equals(capacity);
    }
    public void addShipment(Shipment shipment){
        ArrayList<Vehicle> vehiclesFromShipment = shipment.getVehicles();
        vehicles.addAll(vehiclesFromShipment);
    }
}
