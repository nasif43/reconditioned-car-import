package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class TechnicianDashboardController
{
    @javafx.fxml.FXML
    private BorderPane commonDashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LogoutOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OpenSchedulerOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SystemLogOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void MyAssignmentsOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("RepairTask.fxml");
    }

    @javafx.fxml.FXML
    public void AssignEventsOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("AuctionEvents.fxml");
    }

    @javafx.fxml.FXML
    public void CheckequipmentsOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("Equipment.fxml");
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