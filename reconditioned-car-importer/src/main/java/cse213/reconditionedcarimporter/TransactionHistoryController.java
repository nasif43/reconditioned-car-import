package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AccouintantandTechnician.RepairTask;
import cse213.reconditionedcarimporter.AccouintantandTechnician.TransactionHistory;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TransactionHistoryController
{
    @javafx.fxml.FXML
    private TextField PaymentIDFXID;
    @javafx.fxml.FXML
    private TextField UserIDFXID;
    @javafx.fxml.FXML
    private TableColumn manageExpensesTableColumn;
    @javafx.fxml.FXML
    private TableColumn paymentIDtableColumn;
    @javafx.fxml.FXML
    private TextField RevenueFXID;
    @javafx.fxml.FXML
    private TableColumn manageUserIDTableColumn;
    @javafx.fxml.FXML
    private TextField FilterPaymentIDFXID;
    @javafx.fxml.FXML
    private TableColumn RevenueTableColumn;
    @javafx.fxml.FXML
    private TextField FilterInvoiceIDFXID;
    @javafx.fxml.FXML
    private TableColumn InvoiceIDTableColumn;
    @javafx.fxml.FXML
    private TextField ExpensesFXID;
    @javafx.fxml.FXML
    private TableColumn manageRevenueTableColumn;
    @javafx.fxml.FXML
    private TableColumn AmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn managepaymentIDtableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void NoRadioButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void YesRadioButtononAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageDisplayAllTransactionsOnAction(ActionEvent actionEvent) {
    }
//public TransactionHistory(String paymentId, String invoiceId, String expenses, String revenue)
    @javafx.fxml.FXML
    public void GenerateOnTableOnAction(ActionEvent actionEvent) {
        TransactionHistory newTransactionHistory = new TransactionHistory(PaymentIDFXID.getText(),UserIDFXID.getText(), ExpensesFXID.getText(), RevenueFXID.getText());
        newTransactionHistory.saveTransactionHistory();
    }

    @javafx.fxml.FXML
    public void SearchFilterOnAction(ActionEvent actionEvent) {
    }
}