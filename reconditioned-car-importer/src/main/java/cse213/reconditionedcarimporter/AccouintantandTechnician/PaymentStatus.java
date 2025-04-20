package cse213.reconditionedcarimporter.AccouintantandTechnician;

public class PaymentStatus {
    private String paymentId, invoiceId, currentStatus;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public PaymentStatus(String paymentId, String invoiceId, String currentStatus) {
        this.paymentId = paymentId;
        this.invoiceId = invoiceId;
        this.currentStatus = currentStatus;
    }
}
