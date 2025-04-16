package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.io.File;
import java.util.ArrayList;

public class InventoryReport {
    private int reportId;
    private LocalDate reportDate;
    private int totalVehicles;
    private ArrayList<vehicles > vehiclesInWarehouses;
    private ArrayList<vehicles> vehiclesInShowrooms ;
    private List<Vehicle > agingInventory;
    private ArrayList<Part> lowStockParts ;
//methods
    public File generateExcel(){return null;
    };
    public ArrayList<Vehicle> highlightAgingVehicles(int daysThreshold){return null;
    };
    public File sendToAccountant(){return null;
    };


}
