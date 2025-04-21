package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class ImportManagerDashboardController
{
    @javafx.fxml.FXML
    private BorderPane ImportManagerDashboardBorderPane;

    private void loadFxmlParentToBorderPaneCenter(String fxmlName) {
    try {
        FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
        ImportManagerDashboardBorderPane.setCenter(nextFxmlLoader.load());
    }
    catch (Exception e) {
    }
}
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void LogoutOnAction(ActionEvent actionEvent) {
    }


    @Deprecated
    public void PurchaseRequestOnACtion(ActionEvent actionEvent) {
    }


    @Deprecated
    public void HomeOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShipmentOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("Shipment.fxml");
    }

    @Deprecated
    public void SupplierOrdersOnACtion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void VehicleOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("Vehicle.fxml");
    }

    @javafx.fxml.FXML
    public void ProcessPurchaseReqOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OrderToShippingOnACction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PendingOnACtion(ActionEvent actionEvent) {
    }
}