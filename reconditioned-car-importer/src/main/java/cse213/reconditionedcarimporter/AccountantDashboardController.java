package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

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
        loadFxmlParentToBorderPaneCenter("TransactionHistory.fxml");
    }

    @javafx.fxml.FXML
    public void ChechPaymentsOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("TransactionHistory.fxml");
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


}