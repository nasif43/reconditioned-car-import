package cse213.reconditionedcarimporter.AuctionAndSales;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Customer;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import cse213.reconditionedcarimporter.InventoryAndQuality.InventoryReport;

import java.time.LocalDate;
import java.util.ArrayList;

public class SalesRepresentative extends User{
    public Order createOrder(Customer customer, Vehicle vehicle) {
        if (validateOrderDetails(vehicle)) {
            Order order = new Order();
            order.setCustomerId(customer.getUserId());
            order.setVehicleId(vehicle.getVin());
            order.setStatus("Pending");
            return order;
        }
        return null;
    }

    public ArrayList<Order> manageOrders() {
        // In a real implementation, this would fetch orders from a database
        return new ArrayList<>();
    }

    public ArrayList<Customer> trackPotentialBuyers() {
        // In a real implementation, this would fetch potential buyers from a database
        return new ArrayList<>();
    }

    public SalesReport generateSalesAnalytics(LocalDate startDate, LocalDate endDate) {
        if (startDate != null && endDate != null && !startDate.isAfter(endDate)) {
            return new SalesReport(
                1, // Example report ID
                startDate,
                endDate,
                0.0f, // Example revenue
                new ArrayList<>(), // Example top selling models
                0.0f // Example conversion rate
            );
        }
        return null;
    }

    public InventoryReport checkInventoryAvailability() {
        // In a real implementation, this would check inventory from a database
        return new InventoryReport();
    }

    public Boolean manageSalesPromotions(Promotion promotion) {
        if (promotion != null) {
            promotion.activate();
            return true;
        }
        return false;
    }

    private Boolean validateOrderDetails(Vehicle vehicleDetails) {
        return vehicleDetails != null && 
               vehicleDetails.getVin() != null &&
               !vehicleDetails.getVin().isEmpty();
    }

}
