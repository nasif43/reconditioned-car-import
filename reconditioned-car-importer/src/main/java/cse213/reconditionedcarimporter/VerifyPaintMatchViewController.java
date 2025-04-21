package cse213.reconditionedcarimporter;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

public class VerifyPaintMatchViewController
{
    @javafx.fxml.FXML
    private Label vModelLabel;
    @javafx.fxml.FXML
    private Label vMakeLabel;
    @javafx.fxml.FXML
    private Label vinLabel;
    @javafx.fxml.FXML
    private RadioButton noVisibleDiffradioButton;
    @javafx.fxml.FXML
    private ImageView beforeImage;
    @javafx.fxml.FXML
    private RadioButton visibleDiffradioButton;
    @javafx.fxml.FXML
    private ImageView afterImage;
    @javafx.fxml.FXML
    private Label vYearLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approcePaintRepairButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectPaintRepairButton(ActionEvent actionEvent) {
    }
}