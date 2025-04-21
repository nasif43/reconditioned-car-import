package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class SupportTicketController
{
    @javafx.fxml.FXML
    private ComboBox<String> QueryTypeComboBox;
    @javafx.fxml.FXML
    private TextArea MessageTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        QueryTypeComboBox.getItems().addAll(
                "Technical Issue",
                "Payment Problem",
                "Vehicle Status",
                "Other"
        );
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
        String queryType = QueryTypeComboBox.getValue();
        String message = MessageTextArea.getText();

        if (queryType == null || queryType.isEmpty() || message.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Information");
            alert.setHeaderText(null);
            alert.setContentText("Please select a query type and enter a message.");
            alert.showAndWait();
            return;
        }


        System.out.println(" Support Ticket Submitted:");
        System.out.println(" Query Type: " + queryType);
        System.out.println(" Message: " + message);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ticket Submitted");
        alert.setHeaderText(null);
        alert.setContentText("Your support ticket has been submitted!");
        alert.showAndWait();




