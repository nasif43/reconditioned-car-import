package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;

public class InventoryManager extends User {
    private ArrayList<Warehouse> warehouses;
    private ArrayList<Showroom> showrooms;
    private ArrayList<Shipment> currentShipments;
    private ArrayList<Shipment> pendingShipments;
    private int maxVehiclesToAssignPerDay;
    private static ArrayList<Notification> notifications ;

    public InventoryManager(int userId, String name, String password, String email, String phone, String userRole, ArrayList<Warehouse> warehouses, ArrayList<Showroom> showrooms, ArrayList<Shipment> currentShipments, ArrayList<Shipment> pendingShipments, int maxVehiclesToAssignPerDay, ArrayList<Notification> notifications) {
        super(userId, name, password, email, phone, userRole);
        this.warehouses = warehouses;
        this.showrooms = showrooms;
        this.currentShipments = currentShipments;
        this.pendingShipments = pendingShipments;
        this.maxVehiclesToAssignPerDay = maxVehiclesToAssignPerDay;
        InventoryManager.notifications = notifications;
    }

    public InventoryManager() {
    }

    public static void receiveShipment(Shipment shipment, Warehouse storageLocation){
        shipment.setStatus("ARRIVED_UNCHECKED");
        shipment.setStorageLocation(storageLocation);
        storageLocation.addShipment(shipment);
        String notificationMessage = "New shipment arrived: " + shipment.getShipmentId();
        //String message, LocalDateTime time, boolean isRead, String type
        notifications.add(new Notification(
                notificationMessage, LocalDate.now(),false,
                "SHIPMENT",shipment.getShipmentId()
        ));


    }

    public static ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public static void setNotifications(ArrayList<Notification> notifications) {
        InventoryManager.notifications = notifications;
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
