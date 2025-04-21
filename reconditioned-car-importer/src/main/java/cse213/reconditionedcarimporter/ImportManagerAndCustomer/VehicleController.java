package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VehicleController
{
    @javafx.fxml.FXML
    private TextField VinTF;
    @javafx.fxml.FXML
    private TextField ModelTF;
    @javafx.fxml.FXML
    private TextField GradeTF;
    @javafx.fxml.FXML
    private ComboBox<String> EngineTypeComboBox;
    @javafx.fxml.FXML
    private TextField PurchasePriceTF;
    @javafx.fxml.FXML
    private TextField ExteriorColourTF;
    @javafx.fxml.FXML
    private ComboBox<String> TrasmissonCOmboBox;
    @javafx.fxml.FXML
    private TextField MakeTF;
    @javafx.fxml.FXML
    private TextField MileageTF;
    @javafx.fxml.FXML
    private TextField StatusTF;
    @javafx.fxml.FXML
    private ComboBox<String> LocationComboBox;
    @javafx.fxml.FXML
    private TextField YearTF;
    @javafx.fxml.FXML
    private TextField SellingPriceTF;
    @javafx.fxml.FXML
    private ComboBox<String> FuelTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> EngineTypeCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,Float> SpriceCol;
    @javafx.fxml.FXML
    private TableColumn <Vehicle,String>ModelCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> FuelTypeCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> MakeCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Integer> YearCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Float> mileageCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> VinCOl;
    @javafx.fxml.FXML
    private TableView<Vehicle> TableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> statusCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> EcolourCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> TransmissionCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> gradeCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, Float> PpriceCol;
    @javafx.fxml.FXML
    private TableColumn<Vehicle,String> LocationCol;

    @javafx.fxml.FXML
    public void initialize() {
        EngineTypeComboBox.getItems().addAll("V4", "V6", "V8", "V10");
        TrasmissonCOmboBox.getItems().addAll("Manual", "Automatic");
        FuelTypeComboBox.getItems().addAll("Petrol", "Diesel", "Electric");
        LocationComboBox.getItems().addAll("Dhaka", "CTG Port", "khulna");


        //private String vin, make,model,exteriorColor,engineType,transmission,fuelType,status,grade,location;
        //private float mileage, purchasePrice,sellingPrice;
        //private int year;

        VinCOl.setCellValueFactory(new PropertyValueFactory<>("Vin"));
        ModelCol.setCellValueFactory(new PropertyValueFactory<>("Model"));
        FuelTypeCol.setCellValueFactory(new PropertyValueFactory<>("FuelType"));
        MakeCol.setCellValueFactory(new PropertyValueFactory<>("Make"));
        YearCol.setCellValueFactory(new PropertyValueFactory<>("Year"));
        mileageCol.setCellValueFactory(new PropertyValueFactory<>("Mileage"));
        PpriceCol.setCellValueFactory(new PropertyValueFactory<>("PurchasePrice"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        EcolourCol.setCellValueFactory(new PropertyValueFactory<>("ExteriorColour"));
        TransmissionCol.setCellValueFactory(new PropertyValueFactory<>("Transmission"));
        gradeCol.setCellValueFactory(new PropertyValueFactory<>("Grade"));
        LocationCol.setCellValueFactory(new PropertyValueFactory<>("Location"));
        SpriceCol.setCellValueFactory(new PropertyValueFactory<>("SellingPrice"));
        EngineTypeCol.setCellValueFactory(new PropertyValueFactory<>("EngineType"));

    }

    @javafx.fxml.FXML
    public void ShowonTableOnACtion(ActionEvent actionEvent) {
        String vin = VinTF.getText();
        String model = ModelTF.getText();
        String exteriorColour = ExteriorColourTF.getText();
        String engineType = EngineTypeComboBox.getValue();
        String transmission = TrasmissonCOmboBox.getValue();
        String fuelType = FuelTypeComboBox.getValue();
        String status = StatusTF.getText();
        String grade = GradeTF.getText();
        String location = LocationComboBox.getValue();
        int year = Integer.parseInt(YearTF.getText());
    }

    @javafx.fxml.FXML
    public void ClearOnAction(ActionEvent actionEvent) {
        VinTF.clear();
        ModelTF.clear();
        ExteriorColourTF.clear();
        EngineTypeComboBox.setValue(null);
        TrasmissonCOmboBox.setValue(null);
        FuelTypeComboBox.setValue(null);
        StatusTF.clear();
        GradeTF.clear();
        LocationComboBox.setValue(null);
    }
}