package cse213.reconditionedcarimporter.ImportManagerAndCustomer;


import java.time.LocalDate;

public class PurchaseRequest {
    private int requestId;
    private Customer customer;
    private Vehicle vehicle;
    private float maxBidAmount;
    private LocalDate requestDate;
    private String status; // pending, approved, rejected, completed

    public PurchaseRequest(int requestId, Customer customer, Vehicle vehicle, float maxBidAmount, LocalDate requestDate, String status) {
        this.requestId = requestId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.maxBidAmount = maxBidAmount;
        this.requestDate = requestDate;
        this.status = status;
    }

    public PurchaseRequest(Customer customer, Vehicle vehicle, float maxBid) {
    }

    // Getters and Setters
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public float getMaxBidAmount() {
        return maxBidAmount;
    }

    public void setMaxBidAmount(float maxBidAmount) {
        this.maxBidAmount = maxBidAmount;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
} 