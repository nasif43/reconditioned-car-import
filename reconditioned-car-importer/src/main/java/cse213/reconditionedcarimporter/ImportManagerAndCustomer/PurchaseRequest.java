package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

public class PurchaseRequest {
    private String requestId;
    private String customerId;
    private String vehicleId;
    private float maxBidAmount;
    private String status;
    private String requestDate;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public float getMaxBidAmount() {
        return maxBidAmount;
    }

    public void setMaxBidAmount(float maxBidAmount) {
        this.maxBidAmount = maxBidAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public PurchaseRequest(String requestId, String customerId, String vehicleId, float maxBidAmount, String status, String requestDate) {
        this.requestId = requestId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.maxBidAmount = maxBidAmount;
        this.status = status;
        this.requestDate = requestDate;

    }
}
