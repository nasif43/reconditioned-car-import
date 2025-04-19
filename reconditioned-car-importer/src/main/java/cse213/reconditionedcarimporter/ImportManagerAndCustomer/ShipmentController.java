package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ShipmentController
{
    @javafx.fxml.FXML
    private ListView vehiclesListView;
    @javafx.fxml.FXML
    private TextField OriginTF;
    @javafx.fxml.FXML
    private TextField DestinstionTF;
    @javafx.fxml.FXML
    private ComboBox StorageLocationTF;
    @javafx.fxml.FXML
    private TextField ShipmentIDTF;
    @javafx.fxml.FXML
    private DatePicker DepartureDatePicker;
    @javafx.fxml.FXML
    private TextField CarrierTF;
    @javafx.fxml.FXML
    private DatePicker ArrivalDatePicker;
    @javafx.fxml.FXML
    private ComboBox StatusComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
    }
}