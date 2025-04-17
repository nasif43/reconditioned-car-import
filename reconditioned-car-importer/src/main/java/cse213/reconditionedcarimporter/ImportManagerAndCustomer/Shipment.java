package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.InventoryAndQuality.Location;

import java.time.LocalDate;
import java.util.List;

public class Shipment {
    private int shipmentId;
    private List<Vehicle> vehicles;
    private String origin;
    private String destination;
    private LocalDate arrivalDate,departureDate;
    private ShipmentStatus status;
    private String carrier;
    private Location storageLocation;

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
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

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Location getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Shipment(int shipmentId, List<Vehicle> vehicles, String origin, String destination, LocalDate arrivalDate, LocalDate departureDate, ShipmentStatus status, String carrier, Location storageLocation) {
        this.shipmentId = shipmentId;
        this.vehicles = vehicles;
        this.origin = origin;
        this.destination = destination;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.status = status;
        this.carrier = carrier;
        this.storageLocation = storageLocation;
    }
    public void updateStatus(ShipmentStatus status) {
        this.status = status;
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicles != null) {
            return vehicles.add(vehicle);
        }
        return false;
    }

    public ShippingManifest generateManifest() {
        return null; // or implement actual logic later
    }


}

