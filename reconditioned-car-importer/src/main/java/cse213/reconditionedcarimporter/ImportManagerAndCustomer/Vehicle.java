package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import cse213.reconditionedcarimporter.InventoryAndQuality.Location;

import java.time.LocalDate;

public class Vehicle {

private String vin, make,model,exteriorColor,engineType,transmission,fuelType,status,grade;
private Location location;
private int year;
private float mileage, purchasePrice,sellingPrice;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Vehicle(String vin, String make, String model, String exteriorColor, String engineType, String transmission, String fuelType, String status, String grade, Location location, int year, float mileage, float sellingPrice, float purchasePrice) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.engineType = engineType;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.status = status;
        this.grade = grade;
        this.location = location;
        this.year = year;
        this.mileage = mileage;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
    }
    public void updateStatus(String status) { this.status = status; }

    private float calculateProfit() { return sellingPrice - purchasePrice; }

    public Vehicle getFullDetails() { return this; }

}
