package cse213.reconditionedcarimporter.InventoryAndQuality;

public abstract class Showroom extends Location{
   private FloorPlan floorPlan;
   private ArrayLIst<ShowroomSlot> slots;
   private ArrayList<Vehicle> vehiclesOnDisplay;
//methods
    public abstract boolean assignVehicleToSLot(Vehicle vehicle,ShowroomSlot showroomSlot);
    public abstract ArrayList<Showroomslot> getFreeSlots();
}
