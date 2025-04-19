package cse213.reconditionedcarimporter.AccouintantandTechnician;
import java.time.LocalDate;

public class Payments {
    private String paymentID;
    private float amount;
    private LocalDate date;
    private String method;

    public Payments(String paymentID, float amount, LocalDate date, String method) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.date = date;
        this.method = method;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    private boolean isProcessed = false;
    private boolean isConfirmed = false;

    // Method to process the payment
    public void processPayment() {
        // Add your payment processing logic here
        System.out.println("Processing payment...");
        isProcessed = true;
    }

    // Method to confirm the payment
    public void confirmPayment() {
        // Add your confirmation logic here
        if (isProcessed) {
            System.out.println("Payment confirmed.");
            isConfirmed = true;
        } else {
            System.out.println("Cannot confirm payment before processing.");
        }
    }

    // Optional: Getters to check the payment state
    public boolean isProcessed() {
        return isProcessed;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

}
