package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class PartsController
{
    @javafx.fxml.FXML
    private TextField CompatibleModelsTF;
    @javafx.fxml.FXML
    private TextField TypeTF;
    @javafx.fxml.FXML
    private TextField SupplierTF;
    @javafx.fxml.FXML
    private TextField CostTF;
    @javafx.fxml.FXML
    private TextField ReorderLevelTF;
    @javafx.fxml.FXML
    private TextField QuantityTF;
    @javafx.fxml.FXML
    private TextField NameTF;
    @javafx.fxml.FXML
    private TextField PartIDTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {

        String partId = PartIDTF.getText();
        String name = NameTF.getText();
        String type = TypeTF.getText();
        String compatibleModels = CompatibleModelsTF.getText();
        float cost = Float.parseFloat(CostTF.getText());
        int quantity = Integer.parseInt(QuantityTF.getText());
        int reorderLevel = Integer.parseInt(ReorderLevelTF.getText());
        String supplier = SupplierTF.getText();


        ArrayList<String> compatibleList = new ArrayList<>(List.of(compatibleModels.split(",")));


        Parts newPart = new Parts(partId, name, type, compatibleList, cost, quantity, reorderLevel, supplier);


        System.out.println(" Part Registered: " + newPart.getName() + " (ID: " + newPart.getPartId() + ")");

    }
}