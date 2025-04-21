package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

public class DuePaymentsController
{
    @javafx.fxml.FXML
    private TableColumn PaymentIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn StatusTableColumn;
    @javafx.fxml.FXML
    private DatePicker DueDateDatePicker;
    @javafx.fxml.FXML
    private TextField InvoiceIDFXID;
    @javafx.fxml.FXML
    private TableColumn InvoiceIDTableColumn;
    @javafx.fxml.FXML
    private TextField PaymentIDFXID;
    @javafx.fxml.FXML
    private TableColumn DueDateTableColumn;
    @javafx.fxml.FXML
    private ToggleGroup Approvepayment;
    @javafx.fxml.FXML
    private TextField SelectInvoiceFXID;
    @javafx.fxml.FXML
    private RadioButton ApproveYesRadioButton;
    @javafx.fxml.FXML
    private RadioButton ApproveNoRadioButton;
    @javafx.fxml.FXML
    private TextField SelectPaymentFXID;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GenerateOnAction(ActionEvent actionEvent) {
    }


}