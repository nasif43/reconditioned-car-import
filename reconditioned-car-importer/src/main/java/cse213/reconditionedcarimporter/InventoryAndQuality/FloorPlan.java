package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public abstract class FloorPlan  {
    private String planId;
    private String name;
    private int rows;
    private int columns;
    private ArrayList<ShowroomSlot> slots ;

    public FloorPlan(String planId, String name, int rows, int columns, ArrayList<ShowroomSlot> slots) {
        this.planId = planId;
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        this.slots = slots;
    }

    //methofs
   public abstract void generateSlots(Vehicle vehicle, ShowroomSlot showroomSlot)  ;
    public abstract ArrayList<ShowroomSlot> getFreeSlots() ;

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setSlots(ArrayList<ShowroomSlot> slots) {
        this.slots = slots;
    }

    public String getPlanId() {
        return planId;
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public ArrayList<ShowroomSlot> getSlots() {
        return slots;
    }
}
