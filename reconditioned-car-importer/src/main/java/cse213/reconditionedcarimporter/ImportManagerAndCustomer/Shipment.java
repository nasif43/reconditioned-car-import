package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.InventoryAndQuality.Warehouse;
import cse213.reconditionedcarimporter.utility.AppendableObjectOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Shipment implements Serializable {
    private String shipmentId;
    private ArrayList<Vehicle> vehicles;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String status;
    private String carrier;

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId='" + shipmentId + '\'' +
                ", vehicles=" + vehicles +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", status='" + status + '\'' +
                ", carrier='" + carrier + '\'' +
                ", storageLocation=" + storageLocation +
                '}';
    }

    private Warehouse storageLocation;

    public Shipment() {
        this.shipmentId = "";
        this.vehicles = new ArrayList<>();
    }


    public Shipment(String shipmentId, ArrayList<Vehicle> vehicles, String origin, String destination, LocalDate departureDate, LocalDate arrivalDate, String status, String carrier, Warehouse storageLocation) {
        this.shipmentId = shipmentId;
        this.vehicles = vehicles;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.status = status;
        this.carrier = carrier;
        this.storageLocation = storageLocation;
    }



    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Warehouse getStorageLocation() {
        return storageLocation;
    }
    public int getVehicleCount(){return vehicles != null ? vehicles.size() : 0;}
    public void setStorageLocation(Warehouse storageLocation) {
        this.storageLocation = storageLocation;
    }

    public void saveShipment(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File f = new File( "Shipment.bin" );
            if(f.exists()){
                oos = new AppendableObjectOutputStream(new FileOutputStream(f, true));}
            else{
                oos = new ObjectOutputStream(new FileOutputStream(f));}
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}