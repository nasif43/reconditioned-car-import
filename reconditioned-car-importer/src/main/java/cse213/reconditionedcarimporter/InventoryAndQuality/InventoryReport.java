package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Parts;
import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class InventoryReport extends Report implements Serializable {
    private int totalVehicles;
    private ArrayList<Vehicle> vehiclesInWarehouses;
    private ArrayList<Vehicle> vehiclesInShowrooms ;
    private ArrayList<Vehicle > agingInventory;
    private ArrayList<Parts> lowStockParts ;

    public InventoryReport(String reportId, LocalDate reportDate, int totalVehicles, ArrayList<Vehicle> vehiclesInWarehouses, ArrayList<Vehicle> vehiclesInShowrooms, ArrayList<Vehicle> agingInventory, ArrayList<Parts> lowStockParts) {
        super(reportId, reportDate);
        this.totalVehicles = totalVehicles;
        this.vehiclesInWarehouses = vehiclesInWarehouses;
        this.vehiclesInShowrooms = vehiclesInShowrooms;
        this.agingInventory = agingInventory;
        this.lowStockParts = lowStockParts;
    }

    public InventoryReport() {
    }

    //methods
    @Override
    public void generateReport(){};
    public ArrayList<Vehicle> highlightAgingVehicles(int daysThreshold){return null;
    };
    @Override
    public void sendToAccountant(Report report){};

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public ArrayList<Vehicle> getVehiclesInWarehouses() {
        return vehiclesInWarehouses;
    }

    public void setVehiclesInWarehouses(ArrayList<Vehicle> vehiclesInWarehouses) {
        this.vehiclesInWarehouses = vehiclesInWarehouses;
    }

    public ArrayList<Vehicle> getVehiclesInShowrooms() {
        return vehiclesInShowrooms;
    }

    public void setVehiclesInShowrooms(ArrayList<Vehicle> vehiclesInShowrooms) {
        this.vehiclesInShowrooms = vehiclesInShowrooms;
    }

    public ArrayList<Vehicle> getAgingInventory() {
        return agingInventory;
    }

    public void setAgingInventory(ArrayList<Vehicle> agingInventory) {
        this.agingInventory = agingInventory;
    }

    public ArrayList<Parts> getLowStockParts() {
        return lowStockParts;
    }

    public void setLowStockParts(ArrayList<Parts> lowStockParts) {
        this.lowStockParts = lowStockParts;
    }


}
