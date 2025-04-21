package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

import java.awt.*;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    private BorderPane commonDashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void StatusReportOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void PartRequestsOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void PaymentsOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void TransactionHistoryOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageAndGenerateOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("TransactionHistory.fxml");
    }



    @javafx.fxml.FXML
    public void CheckTaxesOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("TaxManagement.fxml");
    }

    @javafx.fxml.FXML
    public void ChechPaymentsOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("DuePayments.fxml");
    }

    @javafx.fxml.FXML
    public void AuditLogOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("TransactionHistory.fxml");

    }


    private void loadFxmlParentToBorderPaneCenter(String fxmlName) {
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            commonDashboardBorderPane.setCenter(nextFxmlLoader.load());
        }
        catch (Exception e) {
        }
    }


    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("Login.fxml");

    }
}