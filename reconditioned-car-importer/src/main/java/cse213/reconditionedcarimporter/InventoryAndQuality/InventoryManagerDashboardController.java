package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Shipment;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

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
        shipmentVehicleCountColumn.setCellValueFactory(new PropertyValueFactory<>("vehicles")); // assuming vehicles.size() is handled in the model or with a custom cell
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
    readDummyShipment(shipmentsFromBinFile);
    shipmentsTabTableView.getItems().addAll(shipmentsFromBinFile);

    }


    @javafx.fxml.FXML
    public void testDriveRequestMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewPrevReportsMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateIMreportMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void processVehiclePurchaseMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flagAgingVehiclesMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignVehiclesToShowroomMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void seeDashBoardMenuItemOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadReceiveShipmentViewBTn(ActionEvent actionEvent) {
    }

    //dummy shipment
//String shipmentId, ArrayList<Vehicle> vehicles, String origin, String destination, LocalDate departureDate,
// LocalDate arrivalDate, String status, String carrier, Warehouse storageLocation()

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Warehouse dummyWarehouse = new Warehouse(vehicles);
    ArrayList<Shipment> shipments = new ArrayList<>();

        public void makeAndAppendShipmentToBInFIle(){
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try{
                f = new File("Shipments.bin");
                if(f.exists()){
                    fos = new FileOutputStream( f,true );
                    oos = new AppendableObjectOutputStream( fos );
                }
                else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream( fos );
                }

                Shipment shipment2 = new Shipment("1323",vehicles,"origiin",
                        "dhaka", LocalDate.of(2004, 4, 3),
                        LocalDate.now(),"UNCHECKED","Carrier",dummyWarehouse);

                oos.writeObject(shipment2);

                oos.writeObject(
                        new Shipment("123",vehicles,"origin",
                                "dhaka", LocalDate.of(2003, 8, 3),
                                LocalDate.now(),"UNCHECKED","Carrier",dummyWarehouse));

                System.out.println(shipment2.toString());


            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Failed to write object to file.....");
            }
            finally{
                try {
                    if (oos != null) oos.close();
                }
                catch(Exception e){
                    //
                }
            }

        }
        public void readDummyShipment(ArrayList<Shipment> shipmnts){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            String shipmentIdFromView;
            try{
                f = new File("Shipments.bin");
                fis = new FileInputStream( f );
                ois = new ObjectInputStream( fis );

                Shipment a = null;
                while(true){
                    a = (Shipment) ois.readObject();

                    shipmnts.add(a);
                }
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Error reading shipment: " + e.getMessage());
                alert.showAndWait();
            }
            finally{
                try {
                    if (ois != null) ois.close();
                }
                catch(Exception e){
                    //
                }
            }}
    }
