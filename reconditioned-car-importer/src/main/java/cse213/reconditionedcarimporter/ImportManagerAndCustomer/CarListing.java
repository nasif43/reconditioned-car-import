package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.io.Serializable;

public class CarListing implements Serializable {
    private String listingId, vehicleId;
    private float price;
    private Vehicle vehicle;

    public CarListing(String listingId, String vehicleId, float price, Vehicle vehicle) {
        this.listingId = listingId;
        this.vehicleId = vehicleId;
        this.price = price;
        this.vehicle = vehicle;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
