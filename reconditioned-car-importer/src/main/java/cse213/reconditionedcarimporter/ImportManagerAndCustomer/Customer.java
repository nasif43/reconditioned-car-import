package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.Order;
import cse213.reconditionedcarimporter.Promotion;

import java.util.List;

public class Customer {
    public boolean createProfile(CustomerDetails details) { return false; }
    public List<Vehicle> searchAuctionVehicles(SearchCriteria criteria) { return null; }
    public PurchaseRequest placeCarPurchaseRequest(Vehicle vehicle, double maxBid) { return null; }
    public OrderStatus trackOrderStatus(int orderId) { return null; }
    public Payment processPayment(Invoice invoice, PaymentMethod method) { return null; }
    public boolean submitReview(Order order, Review review) { return false; }
    public List<Promotion> viewPromotions() { return null; }
    public SupportTicket submitSupportQuery(String queryType, String message) { return null; }


}
