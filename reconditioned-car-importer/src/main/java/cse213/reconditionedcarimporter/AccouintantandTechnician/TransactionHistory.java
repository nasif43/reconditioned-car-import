package cse213.reconditionedcarimporter.AccouintantandTechnician;

import java.util.ArrayList;

public class TransactionHistory {

    private String transactionId;
    private String customerId;
    private ArrayList<Payments> payments;
    private String Date;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getEndDate() {
        return Date;
    }

    public void setEndDate(String endDate) {
        this.Date = endDate;
    }

    public ArrayList<Payments> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payments> payments) {
        this.payments = payments;
    }

    public TransactionHistory(String transactionId, String customerId, ArrayList<Payments> payments, String Date) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.payments = payments;
        this.Date = Date;
    }






    public void addPayment(Payments payment) {
        // TODO: implement
    }

    public float calculateTotalPaid() {
        // TODO: implement
        return 0;
    }

    public void exportToPDF() {
        // TODO: implement
    }
}
