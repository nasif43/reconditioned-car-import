package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class InvoiceController
{
    @javafx.fxml.FXML
    private DatePicker dateIssuedPicker;
    @javafx.fxml.FXML
    private ComboBox<String> PaymentStatusComboBox;
    @javafx.fxml.FXML
    private TextField CustomerIDTF;
    @javafx.fxml.FXML
    private TextField TotalAmountTF;
    @javafx.fxml.FXML
    private TextField InvoiceIDTF;
    @javafx.fxml.FXML
    private TextField OrderIDTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
        String invoiceId = InvoiceIDTF.getText();
        String orderId = OrderIDTF.getText();
        String customerId = CustomerIDTF.getText();
        String totalAmount = TotalAmountTF.getText();
        String paymentStatus = PaymentStatusComboBox.getValue();



        System.out.println("Invoice Submitted:");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Payment Status: " + paymentStatus);

    }
}