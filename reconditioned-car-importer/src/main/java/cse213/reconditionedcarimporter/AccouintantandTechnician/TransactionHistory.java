package cse213.reconditionedcarimporter.AccouintantandTechnician;
import cse213.reconditionedcarimporter.utility.AppendableObjectOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransactionHistory implements Serializable {

    private String PaymentId;
    private String InvoiceId;
    private String Expenses;
    private String Revenue;

    public TransactionHistory(String paymentId, String invoiceId, String expenses, String revenue) {
        PaymentId = paymentId;
        InvoiceId = invoiceId;
        Expenses = expenses;
        Revenue = revenue;
    }

    public String getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(String paymentId) {
        PaymentId = paymentId;
    }

    public String getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        InvoiceId = invoiceId;
    }

    public String getExpenses() {
        return Expenses;
    }

    public void setExpenses(String expenses) {
        Expenses = expenses;
    }

    public String getRevenue() {
        return Revenue;
    }

    public void setRevenue(String revenue) {
        Revenue = revenue;
    }

    public void saveTransactionHistory() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File f = new File( "TransactionHistory.bin" );
            if(f.exists()){
                oos = new AppendableObjectOutputStream(new FileOutputStream(f, true));}
            else{
                oos = new ObjectOutputStream(new FileOutputStream(f));}
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
