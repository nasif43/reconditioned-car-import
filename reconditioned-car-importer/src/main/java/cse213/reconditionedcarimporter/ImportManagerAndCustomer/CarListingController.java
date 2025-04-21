package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CarListingController
{
    @javafx.fxml.FXML
    private TextField VehicleIDTF;
    @javafx.fxml.FXML
    private TextField ListingIDTF;
    @javafx.fxml.FXML
    private TextField PriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> vehicleComboBox;


    public void initialize() {
        // Add some vehicle models to the dropdown menu
        vehicleComboBox.getItems().addAll(
                "Toyota Premio",
                "Nissan X-Trail",
                "Honda Fit",
                "Mazda Axela",
                "BMW X1"
        );
    }


    @javafx.fxml.FXML
    public void AddOnAction(ActionEvent actionEvent) {

        String listingId = ListingIDTF.getText();
        String vehicleId = VehicleIDTF.getText();
        String priceText = PriceTF.getText();
        String selectedVehicle = vehicleComboBox.getValue();


        if (listingId.isEmpty() || vehicleId.isEmpty() || priceText.isEmpty() || selectedVehicle == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Info");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields and select a vehicle.");
            alert.showAndWait();
            return;
        }


        float price = Float.parseFloat(priceText);


        System.out.println("Listing Added:");
        System.out.println("Listing ID: " + listingId);
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Price: $" + price);
        System.out.println("Selected Vehicle: " + selectedVehicle);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Car listing saved successfully!");
        alert.showAndWait();


        ListingIDTF.clear();
        VehicleIDTF.clear();
        PriceTF.clear();
        vehicleComboBox.getSelectionModel().clearSelection();

    }
}