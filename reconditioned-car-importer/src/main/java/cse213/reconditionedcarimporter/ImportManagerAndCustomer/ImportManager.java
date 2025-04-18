package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.util.function.Supplier;

public class ImportManager {
    public boolean manageCarListings(CarListing listing) { return false; }
    public boolean processCustomerPurchaseRequests(PurchaseRequest request) { return false; }
    public SupplierOrder manageSupplierOrders(Supplier supplier, VehicleDetails details) { return null; }
    public ShippingDetails overseeShippingAndLogistics(Vehicle vehicle) { return null; }
    public boolean verifyAndApprovePayments(Payment payment) { return false; }
    public AnalyticsReport generateReports() { return null; }
    public OwnershipRecord assignCarsToCustomers(Vehicle vehicle, Customer customer) { return null; }
    public Resolution handleCustomerComplaints(Complaint complaint) { return null; }

}
