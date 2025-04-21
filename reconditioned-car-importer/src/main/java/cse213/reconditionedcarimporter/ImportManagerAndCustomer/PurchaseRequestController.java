package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PurchaseRequestController
{
    @javafx.fxml.FXML
    private TextField MaxBidAmountTF;
    @javafx.fxml.FXML
    private ComboBox<String> VehicleComboBox;
    @javafx.fxml.FXML
    private DatePicker RequestDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        VehicleComboBox.getItems().addAll("Toyota Aqua", "Nissan X-Trail", "Honda Fit");

    }

    @javafx.fxml.FXML
    public void SubmitRequestOnAction(ActionEvent actionEvent) {
        try {

            String vehicle = VehicleComboBox.getValue();
            String bid = MaxBidAmountTF.getText();
            String date = RequestDatePicker.getValue().toString();

            
            System.out.println("Vehicle: " + vehicle);
            System.out.println("Max Bid: " + bid);
            System.out.println("Request Date: " + date);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Request submitted!");
            alert.showAndWait();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all fields properly.");
            alert.showAndWait();
        }
    }
}