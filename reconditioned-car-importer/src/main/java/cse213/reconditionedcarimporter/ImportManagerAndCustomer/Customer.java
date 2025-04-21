package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends User implements Serializable {

    private ArrayList<Vehicle> availableVehicles = new ArrayList<>();
    private ArrayList<Promotion> promotions = new ArrayList<>();
    private ArrayList<PurchaseRequest> purchaseRequests = new ArrayList<>();

    public boolean createProfile(Customer details) {
        if (details != null) {
            System.out.println("Profile created for: " + details.getName());
            return true;
        }
        return false;
    }

    public ArrayList<Vehicle> searchAuctionVehicles(String criteria) {
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle v : availableVehicles) {
            if (v.getModel().toLowerCase().contains(criteria.toLowerCase())) {
                results.add(v);
            }
        }
        return results;
    }

    public PurchaseRequest placeCarPurchaseRequest(Vehicle vehicle, float maxBid) {
        PurchaseRequest request = new PurchaseRequest(this, vehicle, maxBid);
        purchaseRequests.add(request);
        System.out.println("Purchase request placed for vehicle: " + vehicle.getModel());
        return request;
    }

    public String trackOrderStatus(int orderId) {
        // Example logic (should ideally search orders list)
        return "Your order #" + orderId + " is currently in processing.";
    }

    public Payments processPayment(Invoice invoice, String method) {
        if (invoice != null && invoice.getTotalAmount() > 0) {
            Payments payment = new Payments(invoice.getInvoiceId(), invoice.getTotalAmount(), method, "Pending");
            System.out.println("Payment initiated for invoice: " + invoice.getInvoiceId());
            return payment;
        }
        return null;
    }

    public ArrayList<Promotion> viewPromotions() {
        return promotions;
    }
}
