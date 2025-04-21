package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Location implements Serializable {
    protected int locationId,capacity, currentCount ;
    protected String name,address;

    public abstract boolean isFull();
    public abstract float calculateutilization();

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
