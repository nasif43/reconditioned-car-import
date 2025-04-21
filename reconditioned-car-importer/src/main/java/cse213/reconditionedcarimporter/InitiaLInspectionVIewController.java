package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class InitiaLInspectionVIewController
{
    @javafx.fxml.FXML
    private Label vehicleIdLabel;
    @javafx.fxml.FXML
    private Label vehicleYearLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer> chooseExterRatingComboBox;
    @javafx.fxml.FXML
    private CheckBox smellCheckBox;
    @javafx.fxml.FXML
    private CheckBox suspensionComboBox;
    @javafx.fxml.FXML
    private CheckBox dentsCheckBox;
    @javafx.fxml.FXML
    private CheckBox upholsteryCheckBox;
    @javafx.fxml.FXML
    private CheckBox rustCheckBox;
    @javafx.fxml.FXML
    private CheckBox engineCheckBox;
    @javafx.fxml.FXML
    private CheckBox paintCheckBox;
    @javafx.fxml.FXML
    private ComboBox<Integer>  chooseMechRatingComboBox;
    @javafx.fxml.FXML
    private Label vehicleModelLabel;
    @javafx.fxml.FXML
    private CheckBox scratchesCheckBox;
    @javafx.fxml.FXML
    private CheckBox electronicsCheckBox;
    @javafx.fxml.FXML
    private CheckBox brakesCheckBox;
    @javafx.fxml.FXML
    private Label vehicleMakeLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer>  chooseInterrRatingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void calculateFinalGradeOnActionBTN(ActionEvent actionEvent) {
    }
}