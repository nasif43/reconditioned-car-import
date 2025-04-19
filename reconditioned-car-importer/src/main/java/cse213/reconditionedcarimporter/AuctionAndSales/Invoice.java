package cse213.reconditionedcarimporter.AuctionAndSales;

import java.time.LocalDate;

public class Invoice {
    private String invoiceId,customerId,description,paymentMethod;
    private Float amount;
    private Boolean isPaid;
    private LocalDate invoiceDate;
    private LocalDate dueDate;

    public Invoice(String invoiceId, String customerId, String description, String paymentMethod, Float amount, Boolean isPaid, LocalDate invoiceDate, LocalDate dueDate) {
        this.invoiceId = invoiceId;
        this.customerId = customerId;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.isPaid = isPaid;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Methods
    public void markAsPaid(String paymentMethod) {
        this.isPaid = true;
        this.paymentMethod = paymentMethod;
    }
    
    public Float calculateTax(Float taxRate) {
        return amount * taxRate;
    }
    
    public Float calculateTotal(Float taxRate) {
        return amount + calculateTax(taxRate);
    }
    
    public boolean isOverdue() {
        return !isPaid && java.time.LocalDate.now().isAfter(dueDate);
    }
    
    public String generateInvoiceSummary() {
        return "Invoice #" + invoiceId + 
               "\nCustomer ID: " + customerId + 
               "\nAmount: $" + amount + 
               "\nDescription: " + description + 
               "\nStatus: " + (isPaid ? "Paid" : "Unpaid") + 
               "\nInvoice Date: " + invoiceDate + 
               "\nDue Date: " + dueDate;
    }

}
