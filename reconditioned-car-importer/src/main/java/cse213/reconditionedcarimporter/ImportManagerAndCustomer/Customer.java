package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.AccouintantandTechnician.Payments;
import cse213.reconditionedcarimporter.AuctionAndSales.Order;
import cse213.reconditionedcarimporter.AuctionAndSales.Promotion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String Name, Email, Phone, Password;
    private int Number;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Customer(String name, String email, String phone, String password, int number) {
        Name = name;
        Email = email;
        Phone = phone;
        Password = password;
        Number = number;

    }

    public boolean createProfile(Customer details) { return false; }
    public ArrayList<Vehicle> searchAuctionVehicles(String SearchCriteria) { return null; }
    public PurchaseRequest placeCarPurchaseRequest(Vehicle vehicle, float maxBid) { return null; }
    public String trackOrderStatus(int orderId) { return null; }
    public Payments processPayment(Invoice invoice, String method) { return null; }
    public boolean submitReview(Order order) { return false; }
    public ArrayList<Promotion> viewPromotions() { return null; }
    public SupportTicket submitSupportQuery(String queryType, String message) { return null; }

}
