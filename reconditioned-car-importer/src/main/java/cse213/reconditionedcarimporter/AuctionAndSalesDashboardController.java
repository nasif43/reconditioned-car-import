package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class AuctionAndSalesDashboardController
{
    @javafx.fxml.FXML
    private BorderPane borderPaneAuctionManager;
    @FXML
    private MenuBar auctionManagerMenuBar;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void preBidPrepMenuButtonOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("PreAuctionBidPreparation.fxml");
    }

    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            Parent root = nextFxmlLoader.load();
            borderPaneAuctionManager.setCenter(root);
        }
        catch(Exception e){
            System.err.println("Error loading " + fxmlName + ": " + e.getMessage());
            // Create alert to show the error to the user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Loading View");
            alert.setHeaderText("Could not load " + fxmlName);
            alert.setContentText("Error: " + e.getMessage() + "\nCheck if the file exists and path is correct.");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void paymentProcessingMenuBarOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("PaymentProcessing.fxml");
    }

    @javafx.fxml.FXML
    public void vehicleInspectionMenuBarOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("VehicleInspection.fxml");
    }

    @Deprecated
    public void auctionHistoryMenuBarOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("AuctionHistory.fxml");
    }

    @javafx.fxml.FXML
    public void shippingAndLogisticsMenuBarOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("ShippingAndLogistics.fxml");
    }

    @FXML
    public void vehicleListForInspectionAuctionManagerOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void auctionHistoryMenuButtonOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void preparedBidsMenuButtonOnAction(ActionEvent actionEvent) {
    }
}