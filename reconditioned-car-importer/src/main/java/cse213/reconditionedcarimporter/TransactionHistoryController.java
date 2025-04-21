package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class TransactionHistoryController
{
    @javafx.fxml.FXML
    private DatePicker UserDatePicker;
    @javafx.fxml.FXML
    private TextField AmountFXID;
    @javafx.fxml.FXML
    private TextField PaymentIDFXID;
    @javafx.fxml.FXML
    private TextField UserIDFXID;
    @javafx.fxml.FXML
    private TableColumn manageDateTableView;
    @javafx.fxml.FXML
    private TableColumn DateTableView;
    @javafx.fxml.FXML
    private TableColumn managepaymentIDtableview;
    @javafx.fxml.FXML
    private TableColumn manageAmountTableview;
    @javafx.fxml.FXML
    private TableColumn UserID;
    @javafx.fxml.FXML
    private TableColumn AmountTableview;
    @javafx.fxml.FXML
    private TableColumn manageUserID;
    @javafx.fxml.FXML
    private TableColumn paymentIDtableview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void NoRadioButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void YesRadioButtononAction(ActionEvent actionEvent) {
    }
}