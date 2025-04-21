package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;
import javafx.scene.control.Alert;

import java.io.Serializable;
import java.util.ArrayList;

public class Showroom extends Location implements Serializable {
    private FloorPlan floorPlan;
    private ArrayList<ShowroomSlot> slots = new ArrayList<>();
    private ArrayList<Vehicle> vehiclesOnDisplay = new ArrayList<>();
    private int maximumCapacity;

    public Showroom(FloorPlan floorPlan, ArrayList<ShowroomSlot> slots, ArrayList<Vehicle> vehiclesOnDisplay, int maximumCapacity) {
        this.floorPlan = floorPlan;
        this.slots = slots;
        this.vehiclesOnDisplay = vehiclesOnDisplay;
        this.maximumCapacity = maximumCapacity;
    }

    public Showroom() {
        this.slots = new ArrayList<>();
        this.vehiclesOnDisplay = new ArrayList<>();
    }

    public Showroom(String dhakaShowroom) {
        super();
    }

    @Override
    public boolean isFull() {
        return vehiclesOnDisplay.size() >= maximumCapacity;
    }

    @Override
    public float calculateutilization() {
        return (float) vehiclesOnDisplay.size() / maximumCapacity;
    }

    public void addVehicle(Vehicle vehicle) {
        vehiclesOnDisplay.add(vehicle);

    }

    public FloorPlan getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(FloorPlan floorPlan) {
        this.floorPlan = floorPlan;
    }

    public ArrayList<ShowroomSlot> getSlots() {
        return slots;
    }

    public void setSlots(ArrayList<ShowroomSlot> slots) {
        this.slots = slots;
    }

    public ArrayList<Vehicle> getVehiclesOnDisplay() {
        return vehiclesOnDisplay;
    }

    public void setVehiclesOnDisplay(ArrayList<Vehicle> vehiclesOnDisplay) {
        this.vehiclesOnDisplay = vehiclesOnDisplay;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
}

