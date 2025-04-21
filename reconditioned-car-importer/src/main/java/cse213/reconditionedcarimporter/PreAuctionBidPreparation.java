package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private Button saveBidButtonOnAction;
    @javafx.fxml.FXML
    private TextField auctionHouseNameTextField;
    @javafx.fxml.FXML
    private TextArea evaluationCommentsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        letterGradeComboBox.getItems().addAll("A", "B", "C", "D", "E", "F");
    }

    @javafx.fxml.FXML
    public void previewButtonOnAction(ActionEvent actionEvent) {
    }
}