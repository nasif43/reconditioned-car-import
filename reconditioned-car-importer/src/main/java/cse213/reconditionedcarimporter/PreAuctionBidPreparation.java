package cse213.reconditionedcarimporter;

import java.time.LocalDate;
import java.io.IOException;

import cse213.reconditionedcarimporter.AuctionAndSales.BidProposal;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PreAuctionBidPreparation
{
    @javafx.fxml.FXML
    private TextField vinTextField;
    @javafx.fxml.FXML
    private DatePicker auctionDateDatePicker;
    @javafx.fxml.FXML
    private Button clearAllFieldsButtonOnAction;
    @javafx.fxml.FXML
    private TextField conditionRatingTextField;
    @javafx.fxml.FXML
    private TextField lotNumberTextField;
    @javafx.fxml.FXML
    private DatePicker inspectionDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> letterGradeComboBox;
    @javafx.fxml.FXML
    private TextField auctionHouseNameTextField;
    @javafx.fxml.FXML
    private TextArea evaluationCommentsTextArea;

    // Declare the field but don't initialize it yet

    @javafx.fxml.FXML
    public void initialize() {
        letterGradeComboBox.getItems().addAll("A", "B", "C", "D", "E", "F");
    }

    @javafx.fxml.FXML
    public void previewButtonOnAction(ActionEvent actionEvent) {
        BidProposal tempBidProposal = new BidProposal(generateId(),
                auctionHouseNameTextField.getText(),
                Integer.parseInt(lotNumberTextField.getText()),
                vinTextField.getText(),
                conditionRatingTextField.getText(),
                letterGradeComboBox.getValue(),
                evaluationCommentsTextArea.getText(),
                auctionDateDatePicker.getValue(),
                inspectionDateDatePicker.getValue());

        tempBidProposal.previewBidProposal();
        loadFxml();
    }

    @javafx.fxml.FXML
    public void saveBidButtonOnAction(ActionEvent actionEvent) {
        try {
            // Create the BidProposal object when the save button is clicked
            BidProposal newBidProposal = new BidProposal("Preview",
                auctionHouseNameTextField.getText(),
                Integer.parseInt(lotNumberTextField.getText()), 
                vinTextField.getText(), 
                conditionRatingTextField.getText(), 
                letterGradeComboBox.getValue(), 
                evaluationCommentsTextArea.getText(), 
                auctionDateDatePicker.getValue(), 
                inspectionDateDatePicker.getValue());
                
            newBidProposal.saveBidProposal();
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

    public String generateId(){
        String vin = vinTextField.getText();
        String lotNumber = lotNumberTextField.getText();
        LocalDate auctionDate = auctionDateDatePicker.getValue();
        if (vin == null || vin.isEmpty() || lotNumber == null || lotNumber.isEmpty() || auctionDate == null) {
            return "INVALID_INPUT";
        }
        String dateStr = auctionDate.toString();
        String vinPart = vin.length() > 4 ? vin.substring(0, 4) : vin;
        String lotPart = lotNumber.length() > 3 ? lotNumber.substring(0, 3) : lotNumber;
        String id = dateStr + "-" + lotPart + "-" + vinPart;

        return id;
    }
    private void loadFxml() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PreparedBidDetailsView.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Preview");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error loading " + "PreparedBidDetailsView.fxml" + ": " + e.getMessage());
        }
    }
}