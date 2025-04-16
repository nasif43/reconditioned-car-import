package cse213.reconditionedcarimporter.InventoryAndQuality;

public abstract class FloorPlan  {
    private String planId;
    private String name;
    private int rows;
    private int columns;
    private ArrayLIst<ShowroomSlot> slots ;
//methofs
   public abstract void generateSlots(Vehicle,ShowroomSlot) ;
    public abstract ArrayList<Showroomslot> getFreeSlots() ;

}
