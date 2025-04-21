package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

public class SupportTicket {
    private int ticketId;
    private int customerId;
    private String queryType;
    private String message;
    private String status;
    private String createdDate;
    private String resolvedDate;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(String resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public SupportTicket(int ticketId, int customerId, String queryType, String message, String status, String createdDate, String resolvedDate) {
        this.ticketId = ticketId;
        this.customerId = customerId;
        this.queryType = queryType;
        this.message = message;
        this.status = status;
        this.createdDate = createdDate;
        this.resolvedDate = resolvedDate;

    }
}
