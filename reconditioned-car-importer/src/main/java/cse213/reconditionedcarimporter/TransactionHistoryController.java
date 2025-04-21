package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TransactionHistoryController
{
    @javafx.fxml.FXML
    private DatePicker UserDatePicker;
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
    private TableColumn manageDateTableColumn;
    @javafx.fxml.FXML
    private TextField FilterInvoiceIDFXID;
    @javafx.fxml.FXML
    private TableColumn DateTableColumn;
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

    @javafx.fxml.FXML
    public void NoRadioButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void YesRadioButtononAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageDisplayAllTransactionsOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateOnTableOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SearchFilterOnAction(ActionEvent actionEvent) {
    }
}