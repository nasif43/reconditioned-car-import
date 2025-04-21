package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.InventoryAndQuality.Warehouse;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ShipmentController
{
    @javafx.fxml.FXML
    private ListView<String> vehiclesListView;
    @javafx.fxml.FXML
    private TextField OriginTF;
    @javafx.fxml.FXML
    private TextField DestinstionTF;
    @javafx.fxml.FXML
    private ComboBox<String> StorageLocationTF;
    @javafx.fxml.FXML
    private TextField ShipmentIDTF;
    @javafx.fxml.FXML
    private DatePicker DepartureDatePicker;
    @javafx.fxml.FXML
    private TextField CarrierTF;
    @javafx.fxml.FXML
    private DatePicker ArrivalDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> StatusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveShipmentOnAction(ActionEvent actionEvent) {
        try {
            // Create the Shipment object when the save button is clicked
            //String shipmentId, ArrayList<Vehicle> vehicles, String origin, String destination, LocalDate departureDate, LocalDate arrivalDate, String status, String carrier, Warehouse
            //storageLocation
            Shipment newShipment = new Shipment(
                    vehiclesListView.getItems(),
                    OriginTF.getText(),
                    DestinstionTF.getText(),
                    StorageLocationTF.getValue(),
                    ShipmentIDTF.getText(),
                    DepartureDatePicker.getValue(),
                    ArrivalDatePicker.getValue(),
                    CarrierTF.getText(),
                    StatusComboBox.getValue());

            newShipment.saveShipment();
            System.out.println("Save completed successfully");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Successfully saved the bid proposal");
            alert.showAndWait();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }
}