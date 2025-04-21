package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class CustomerDashboardController
{   private void loadFxmlParentToBorderPaneCenter(String fxmlName) {
    try {
        FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
        CustomerDashboardBorderPane.setCenter(nextFxmlLoader.load());
    }
    catch (Exception e) {
    }
}

    @javafx.fxml.FXML
    private BorderPane CustomerDashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void LogoutOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void PromotionsOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void PaymentsOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void HomeOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void SupportCenterOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("Support Ticket.fxml");
    }


    @javafx.fxml.FXML
    public void ResgisterOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("RegisterForCustomer.fxml");
    }

    @javafx.fxml.FXML
    public void RequestTestDriveOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("TestDrive.fxml");
    }


    @javafx.fxml.FXML
    public void CarListingOnAction(ActionEvent actionEvent) {

        loadFxmlParentToBorderPaneCenter("CarListing.fxml");
    }

    @javafx.fxml.FXML
    public void PurchaseRequestOnACtion(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("PurchaseRequest.fxml");
    }
}