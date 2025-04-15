package cse213.reconditionedcarimporter;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesRepresentative extends User{
    public Order createOrder(Customer customer, Vehicle vehicle){return null;}
    public ArrayList<Order> manageOrders(){return null;}
    public ArrayList<Customer> trackPotentialBuyers(){return null;}
    public SalesReport generateSalesAnalytics(LocalDate startDate, LocalDate endDate){return null;}
    public InventoryReport checkInventoryAvailability(){return null;}
    public Boolean manageSalesPromotions(Promotion promotion){return null;}
    public DeliverySchedule scheduleDelivery(Order order){return null;}
    private Boolean validateOrderDetails(VehicleDetails vehicleDetails){return null;}
}
