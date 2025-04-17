package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;

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

    public void receiveShipment(Shipment shipment){}
    public void assignVehicletoShowroom(Vehicle vehicle,Showroom showroom){

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
}
