package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PurchaseRequestController
{
    @javafx.fxml.FXML
    private TextField MaxBidAmountTF;
    @javafx.fxml.FXML
    private ComboBox VehicleComboBox;
    @javafx.fxml.FXML
    private DatePicker RequestDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitRequestOnAction(ActionEvent actionEvent) {
    }
}