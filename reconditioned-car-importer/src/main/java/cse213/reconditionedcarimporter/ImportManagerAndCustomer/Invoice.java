package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

public class Invoice {
    private String invoiceId;
    private String orderId;
    private String customerId;
    private String dateIssued;
    private float totalAmount;
    private String paymentStatus;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Invoice(String invoiceId, String orderId, String customerId, String dateIssued, float totalAmount, String paymentStatus) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.dateIssued = dateIssued;
        this.totalAmount = totalAmount;
        this.paymentStatus = paymentStatus;

    }
}
