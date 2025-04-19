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
    private ComboBox PaymentStatusComboBox;
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
    }
}