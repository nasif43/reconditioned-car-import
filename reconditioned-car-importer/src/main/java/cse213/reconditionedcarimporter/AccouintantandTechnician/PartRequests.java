package cse213.reconditionedcarimporter.AccouintantandTechnician;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;

public class PartRequests {


    private String requestId;
    private Parts part;
    private int quantity;
    private String status;
    private String requestedBy;
    private String requestDate;

    public PartRequests(String requestId, Parts part, int quantity, String status) {
        this.requestId = requestId;
        this.part = part;
        this.quantity = quantity;
        this.status = status;
    }

    public PartRequests(String parts, int quantity) {
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Parts getPart() {
        return part;
    }

    public void setPart(Parts part) {
        this.part = part;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void approveRequest() {
        // TODO: implement
    }

    public void rejectRequest(String reason) {
        // TODO: implement
    }




}
