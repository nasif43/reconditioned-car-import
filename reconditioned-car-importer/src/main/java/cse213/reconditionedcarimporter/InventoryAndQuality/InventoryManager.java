package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public class InventoryManager extends User {
ArrayList<Warehouse> warehouses;
ArrayList<Showroom> showrooms;
ArrayList<Shipment> currentShipments;
ArrayList<Shipment> pendingShipments;
int maxVehiclesToAssignPerDay;

    public InventoryManager(int userId, String name, String password, String email, String phone, String userRole, ArrayList<Warehouse> warehouses, ArrayList<Showroom> showrooms, ArrayList<Shipment> currentShipments, ArrayList<Shipment> pendingShipments, int maxVehiclesToAssignPerDay) {
        super(userId, name, password, email, phone, userRole);
        this.warehouses = warehouses;
        this.showrooms = showrooms;
        this.currentShipments = currentShipments;
        this.pendingShipments = pendingShipments;
        this.maxVehiclesToAssignPerDay = maxVehiclesToAssignPerDay;
    }

    public InventoryManager() {
    }

    public void receiveShipment(Shipment shipment, Warehouse storageLocation){
shipment.setStatus("ARRIVED_UNCHECKED");
shipment.setStorageLocation(storageLocation);
storageLocation.addShipment(shipment);
    }
    public void assignVehicletoShowroom(Vehicle vehicle, Showroom showroom){

        }
    public ArrayList<Vehicle> flagAgingInventory(int daysThreshold){
        return null;
    }
    public  InventoryReport generateMonthlyReport(){
    return null;
    }
    public void processCustomerPurchase(Order order){

    }
    public RefundRequest handleCustomerReturns(Order order,String reason){
    return null;
    }
    public void reorderPart(Part part,int quantity){

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
