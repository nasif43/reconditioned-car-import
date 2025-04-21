package cse213.reconditionedcarimporter;

import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ToggleGroup;

public class DefectController
{
    @javafx.fxml.FXML
    private ComboBox <String> DefectSeverityComboBox;
    @javafx.fxml.FXML
    private RadioButton NoRadioButton;
    @javafx.fxml.FXML
    private RadioButton YesRadioButton;
    @javafx.fxml.FXML
    private ToggleGroup Approval;
    @javafx.fxml.FXML
    private TableColumn DefectTableview;
    @javafx.fxml.FXML
    private TableColumn ApprovalTableview;
    @javafx.fxml.FXML
    private TableColumn CostTableview;
    @javafx.fxml.FXML
    private TableColumn CategoryTableview;
    @javafx.fxml.FXML
    private TableColumn SeverityTableview;

    @javafx.fxml.FXML
    public void initialize() {
        DefectSeverityComboBox.getItems().addAll("1", "2", "3","4", "5" );
    }
}