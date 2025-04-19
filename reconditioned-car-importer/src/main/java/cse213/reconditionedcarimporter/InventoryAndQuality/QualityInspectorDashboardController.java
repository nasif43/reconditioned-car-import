package cse213.reconditionedcarimporter.InventoryAndQuality;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class QualityInspectorDashboardController
{
    @javafx.fxml.FXML
    private ComboBox exteriorRating;
    @javafx.fxml.FXML
    private ComboBox interiorRating;
    @javafx.fxml.FXML
    private ListView activeRepairs;
    @javafx.fxml.FXML
    private TableView inspectionTable;
    @javafx.fxml.FXML
    private ListView defectsList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSubmitInspection(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleStartInspection(ActionEvent actionEvent) {
    }
}