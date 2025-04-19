package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.*;
import java.util.ArrayList;

public class Customer extends User {

    public boolean createProfile(Customer details) { return false; }
    public ArrayList<Vehicle> searchAuctionVehicles(String criteria) { return null; }
    public PurchaseRequest placeCarPurchaseRequest(Vehicle vehicle, float maxBid) { 
        return new PurchaseRequest(this, vehicle, maxBid);
    }
    public String trackOrderStatus(int orderId) { return null; }
    public Payments processPayment(Invoice invoice, String method) { return null; }
    public ArrayList<Promotion> viewPromotions() { return null; }

}
