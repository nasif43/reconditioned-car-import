package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Customer;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.time.LocalDate;

public class TestDrive {
    private String customerName;
    private Vehicle vehicle;
    private LocalDate scheduledTime;
    private String status;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDate scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TestDrive(String customerName, Vehicle vehicle, LocalDate scheduledTime, String status) {
        this.customerName = customerName;
        this.vehicle = vehicle;
        this.scheduledTime = scheduledTime;
        this.status = status;
    }

    public TestDrive() {
    }
}
