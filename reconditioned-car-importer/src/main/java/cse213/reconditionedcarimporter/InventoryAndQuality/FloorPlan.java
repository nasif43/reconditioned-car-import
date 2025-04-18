package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public abstract class FloorPlan  {
    private String planId;
    private String name;
    private int rows;
    private int columns;
    private ArrayList<ShowroomSlot> slots ;
//methofs
   public abstract void generateSlots(Vehicle vehicle, ShowroomSlot showroomslot) ;
    public abstract ArrayList<ShowroomSlot> getFreeSlots() ;

}
