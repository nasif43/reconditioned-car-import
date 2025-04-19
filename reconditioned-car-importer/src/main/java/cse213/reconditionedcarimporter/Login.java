package cse213.reconditionedcarimporter;

import cse213.reconditionedcarimporter.AuctionAndSales.AuctionManager;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Objects;

public class Login {
    @javafx.fxml.FXML
    private PasswordField loginPasswordField;
    @javafx.fxml.FXML
    private ComboBox<String> loginSelectRoleComboBox;
    @javafx.fxml.FXML
    private TextField loginUserIdTextField;

    public void initialize() {
        loginSelectRoleComboBox.getItems().addAll("Auction Manager", "Sales Manager", "Import Manager", "Customer", "Inventory Manager", "Quality Inspector", "Accountant", "Technician");
    }

    public void handleLoginButtonAction() {
        String selectedRole = loginSelectRoleComboBox.getValue();
        
        // Debug print
        System.out.println("Selected role: " + selectedRole);
        
        if (Objects.equals(selectedRole, "Auction Manager") || Objects.equals(selectedRole, "Sales Manager")) {
            loadUserDashboardFromFXML("AuctionAndSalesDasboard.fxml");
        }
        if (Objects.equals(selectedRole, "Import Manager") || Objects.equals(selectedRole, "Customer")) {
            loadUserDashboardFromFXML("ImportAndSalesDashboard.fxml");
        }
        if (Objects.equals(selectedRole, "Inventory Manager") || Objects.equals(selectedRole, "Quality Inspector")) {
            loadUserDashboardFromFXML("QualityInspectorDashboard.fxml");
        }
        if (Objects.equals(selectedRole, "Technician") || Objects.equals(selectedRole, "Accountant")) {
            loadUserDashboardFromFXML("TODO.fxml");
        }

    }
    private void loadUserDashboardFromFXML(String fxmlName){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) loginUserIdTextField.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("Error loading " + fxmlName + ": " + e.getMessage());
            e.printStackTrace();
            
            // Create alert to show the error to the user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Loading Dashboard");
            alert.setHeaderText("Could not load " + fxmlName);
            alert.setContentText("Error: " + e.getMessage() + "\nCheck if the file exists and path is correct.");
            alert.showAndWait();
        }
    }
}
