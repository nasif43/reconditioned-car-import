package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.Order;

import java.util.function.Supplier;

public class ImportManager {
    public boolean manageCarListings(CarListing listing) { return false; }
    public boolean processCustomerPurchaseRequests(PurchaseRequest request) { return false; }
    public Order manageSupplierOrders( Vehicle details) { return null; }
    public Shipment overseeShippingAndLogistics(Vehicle vehicle) { return null; }
    public boolean verifyAndApprovePayments(Payments payment) { return false; }
//    public AnalyticsReport generateReports() { return null; }
//    public OwnershipRecord assignCarsToCustomers(Vehicle vehicle, Customer customer) { return null; }
//    public Resolution handleCustomerComplaints(Complaint complaint) { return null; }

}
