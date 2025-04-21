package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.HelloApplication;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class InventoryManagerDashboardController
{
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentIdColumn;
    @javafx.fxml.FXML
    private TableView<Notification> notificationsTableView;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,Integer> warehouseVehicleCountCol;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,String> warehouseNameCol;
    @javafx.fxml.FXML
    private TableColumn<Shipment,Integer> shipmentVehicleCountColumn;
    @javafx.fxml.FXML
    private BorderPane imDashboardBorderPane;
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentStatusColumn;
    @javafx.fxml.FXML
    private TableColumn<Notification,String> notificationsBarColu;
    @javafx.fxml.FXML
    private Tab notificationsTab;
    @javafx.fxml.FXML
    private Tab shipmentTab;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,Integer> warehouseCapacityCol;
    @javafx.fxml.FXML
    private Tab warehouseTab;
    @javafx.fxml.FXML
    private TableColumn<Shipment,Warehouse> shipmentLoactionColumn;
    @javafx.fxml.FXML
    private TableView<Warehouse> warhousesTableView;
    @javafx.fxml.FXML
    private TableColumn<Warehouse,String> warehouseStatusCol;
    @javafx.fxml.FXML
    private TableColumn<Shipment, LocalDate> arrivalDateColumn;
    @javafx.fxml.FXML
    private TableView<Shipment> shipmentsTabTableView;
    @javafx.fxml.FXML
    private TableColumn<Shipment,String> shipmentOriginColumn;
    @javafx.fxml.FXML
    private TableColumn<Notification, Boolean> notificationIsReadCol;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> notificationsTypeCol;

    private ArrayList<Shipment> shipmentsFromBinFile = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        //shipmtn
        shipmentIdColumn.setCellValueFactory(new PropertyValueFactory<>("shipmentId"));
        shipmentOriginColumn.setCellValueFactory(new PropertyValueFactory<>("origin"));
        shipmentStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        shipmentVehicleCountColumn.setCellValueFactory(new PropertyValueFactory<>("vehicleCount")); // assuming vehicles.size() is handled in the model or with a custom cell
        shipmentLoactionColumn.setCellValueFactory(new PropertyValueFactory<>("storageLocation"));
        arrivalDateColumn.setCellValueFactory(new PropertyValueFactory<>("arrivalDate"));
        //wh
        warehouseNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        warehouseCapacityCol.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        warehouseVehicleCountCol.setCellValueFactory(new PropertyValueFactory<>("vehicleCount")); // assuming there's a field or getter for this
        warehouseStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        //ntf
        notificationsBarColu.setCellValueFactory(new PropertyValueFactory<>("message")); // assuming "message" holds the main content
        notificationsTypeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        notificationIsReadCol.setCellValueFactory(new PropertyValueFactory<>("read")); // assuming "read" is a boolean
    //loading shipment table
    createDummyShipment();
    System.out.println("Dummy shipment created");
        readShipment();
    }


    @javafx.fxml.FXML
    public void testDriveRequestMenuItemOnAction(ActionEvent actionEvent) throws IOException {
        loadFxmlParentToBorderPaneCenter("ApproveTestDriveRequestView.fxml");
    }


    @javafx.fxml.FXML
    public void generateIMreportMenuItemOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("InventoryReportView.fxml");
    }

    @javafx.fxml.FXML
    public void processVehiclePurchaseMenuItemOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("VehicleHandoverVIew.fxml");
    }

    @javafx.fxml.FXML
    public void flagAgingVehiclesMenuItemOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("FlagAgingInventoryView.fxml");
    }

    @javafx.fxml.FXML
    public void assignVehiclesToShowroomMenuItemOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("AssignVehiclesToShowroomView.fxml");
    }

    @javafx.fxml.FXML
    public void seeDashBoardMenuItemOnAction(ActionEvent actionEvent) {
        loadFxmlParentToBorderPaneCenter("InventoryManagerDashboardView.fxml");
    }
    // loadFxmlParentToBorderPaneCenter("receiveShipmentView.fxml");

    @javafx.fxml.FXML

    public void loadReceiveShipmentViewBTn(ActionEvent actionEvent) {
        Shipment selected = shipmentsTabTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            loadReceiveShipmentView(selected);
            System.out.println("selected");
        } else {
            System.out.println("Please select a shipment first!");
        }
    }
    public void loadReceiveShipmentView(Shipment shipment) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("receiveShipmentView.fxml"));
            Parent root = loader.load();
            receiveShipmentViewController controller = loader.getController();
            controller.setShipment(shipment);
            imDashboardBorderPane.setCenter(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //dummy shipment
//String shipmentId, ArrayList<Vehicle> vehicles, String origin, String destination, LocalDate departureDate,
// LocalDate arrivalDate, String status, String carrier, Warehouse storageLocation()

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Warehouse dummyWarehouse = new Warehouse(vehicles);
    ArrayList<Shipment> shipments = new ArrayList<>();
    public void readShipment() {
        shipmentsTabTableView.getItems().clear();
        
        try {
            File f = new File("Shipment.bin");
            if (!f.exists()) {
                System.out.println("Shipment.bin not found");
                return;
            }
            
            try (FileInputStream fis = new FileInputStream(f);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                
                System.out.println("Reading from Shipment.bin");
                
                while (true) {
                    try {
                        Object obj = ois.readObject();
                        if (obj instanceof Shipment) {
                            Shipment shipment = (Shipment) obj;
                            System.out.println("Loaded shipment: " + shipment.getShipmentId());
                            shipmentsTabTableView.getItems().add(shipment);
                        } else {
                            System.out.println("Found non-shipment object: " + obj.getClass().getName());
                        }
                    } catch (EOFException eof) {
                        // End of file reached
                        System.out.println("Finished reading shipments");
                        break;
                    } catch (ClassNotFoundException | InvalidClassException e) {
                        System.out.println("Class error: " + e.getMessage());
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to clear the shipment file if needed
    public void clearShipmentFile() {
        try {
            File f = new File("Shipment.bin");
            if (f.exists()) {
                if (f.delete()) {
                    System.out.println("Shipment.bin file deleted successfully");
                } else {
                    System.out.println("Failed to delete Shipment.bin file");
                }
            }
        } catch (Exception e) {
            System.out.println("Error clearing shipment file: " + e.getMessage());
        }
    }

    private void loadFxmlParentToBorderPaneCenter(String fxmlName){
        try {
            FXMLLoader nextFxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlName));
            imDashboardBorderPane.setCenter(nextFxmlLoader.load());
        }
        catch(Exception e){
            //
        }
    }
    
    private void createDummyShipment() {
        try {
            // Create a basic dummy shipment with initialized objects
            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            
            // Use the default constructor to avoid null fields
            Warehouse warehouse = new Warehouse();
            warehouse.setName("Main Warehouse");
            warehouse.setCapacity(100);
            
            // Create dummy shipment with proper initialization
            Shipment dummyShipment = new Shipment(
                "SHIP123", 
                vehicleList, 
                "Japan", 
                "Bangladesh", 
                LocalDate.now().minusDays(10), 
                LocalDate.now(), 
                "Pending", 
                "BDAIR", 
                warehouse
            );
            
            // Save the properly initialized shipment
            dummyShipment.saveShipment();
            System.out.println("Dummy shipment created and saved successfully");
        } catch (Exception e) {
            System.out.println("Error creating dummy shipment: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
