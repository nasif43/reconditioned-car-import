package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.util.function.Supplier;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.User;

public class ImportManager extends User {
    public boolean manageCarListings(CarListing listing) { return false; }
    public boolean processCustomerPurchaseRequests(PurchaseRequest request) { return false; }
    public Order manageSupplierOrders(String supplier, Vehicle vehicle) { return null; }
    public Shipment overseeShippingAndLogistics(Vehicle vehicle) { return null; }
    public boolean verifyAndApprovePayments(Payments payment) { return false; }
    // public AnalyticsReport generateReports() { return null; }
    // public OwnershipRecord assignCarsToCustomers(Vehicle vehicle, Customer customer) { return null; }
}
