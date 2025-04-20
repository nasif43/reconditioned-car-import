package cse213.reconditionedcarimporter;

import javafx.scene.control.ComboBox;

public class DefectController
{
    @javafx.fxml.FXML
    private ComboBox <String> DefectSeverityComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        DefectSeverityComboBox.getItems().addAll("1", "2", "3","4", "5" );
    }
}