package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class InventoryManager extends User implements Serializable {
ArrayList<Warehouse> warehouses;
ArrayList<Showroom> showrooms;
ArrayList<Shipment> currentShipments;
ArrayList<Shipment> pendingShipments;
int maxVehiclesToAssignPerDay;

    public InventoryManager(String userId, String name, String password, String email, String phone, String userRole, ArrayList<Warehouse> warehouses, ArrayList<Showroom> showrooms, ArrayList<Shipment> currentShipments, ArrayList<Shipment> pendingShipments, int maxVehiclesToAssignPerDay) {
        super(userId, name, password, email, phone, userRole);
        this.warehouses = warehouses;
        this.showrooms = showrooms;
        this.currentShipments = currentShipments;
        this.pendingShipments = pendingShipments;
        this.maxVehiclesToAssignPerDay = maxVehiclesToAssignPerDay;
        warehouses = new ArrayList<>();
        warehouses.add(new Warehouse("Chittagong_WH1"));
        warehouses.add(new Warehouse("Dhaka_WH1"));
        warehouses.add(new Warehouse("Dhaka_WH2"));
        warehouses.add(new Warehouse("Dhaka_WH3"));
        warehouses.add(new Warehouse("Dhaka_WH4"));
        //
        showrooms = new ArrayList<>();
        showrooms.add(new Showroom("Chittagong_Showroom"));
        showrooms.add(new Showroom("Dhaka_Showroom"));
        showrooms.add(new Showroom("Dhaka_Showroom_premium"));
        showrooms.add(new Showroom("Outlet_showroom"));
        showrooms.add(new Showroom("Sylhet_Showroom"));
    }

    public InventoryManager() {
    }

    public void receiveShipment(Shipment shipment, Warehouse storageLocation){
        shipment.setStatus("ARRIVED_UNCHECKED");
        shipment.setStorageLocation(storageLocation);
        shipment.setArrivalDate(LocalDate.now());
        for (Vehicle v : shipment.getVehicles()){
          v.setStatus("AWAITING_INSPECTION");
        }
        storageLocation.addShipment(shipment);
        //add file code in ocntroler


    }
    public void assignVehicletoShowroom(Vehicle vehicle, Showroom showroom){
        showroom.addVehicle(vehicle);
        vehicle.setStatus("READY_FOR_SALE");
        vehicle.setLocation(showroom);
    }
    public void flagAgingInventory(Vehicle vehicle, int daysThreshold,
                                                 String vehicleID,Showroom outletShowroom ,
                                                 Showroom currentShowroom){
        for (Vehicle v : currentShowroom.getVehiclesOnDisplay()){
        v.setLocation(outletShowroom);
        }
    }
    public  Location generateMonthlyReport(Location location){
    return location;
    }
    public void processCustomerPurchase(Order order){

    }
//    public RefundRequest handleCustomerReturns(Order order,String reason){
//    return null;
//    }
    public void reorderPart(Parts part, int quantity){

    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(ArrayList<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public ArrayList<Showroom> getShowrooms() {
        return showrooms;
    }

    public void setShowrooms(ArrayList<Showroom> showrooms) {
        this.showrooms = showrooms;
    }

    public ArrayList<Shipment> getCurrentShipments() {
        return currentShipments;
    }

    public void setCurrentShipments(ArrayList<Shipment> currentShipments) {
        this.currentShipments = currentShipments;
    }

    public ArrayList<Shipment> getPendingShipments() {
        return pendingShipments;
    }

    public void setPendingShipments(ArrayList<Shipment> pendingShipments) {
        this.pendingShipments = pendingShipments;
    }

    public int getMaxVehiclesToAssignPerDay() {
        return maxVehiclesToAssignPerDay;
    }

    public void setMaxVehiclesToAssignPerDay(int maxVehiclesToAssignPerDay) {
        this.maxVehiclesToAssignPerDay = maxVehiclesToAssignPerDay;
    }
}
