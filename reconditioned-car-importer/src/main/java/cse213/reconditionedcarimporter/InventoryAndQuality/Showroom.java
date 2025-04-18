package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public class Showroom extends Location{
   private FloorPlan floorPlan;
   private ArrayList<ShowroomSlot> slots;
   private ArrayList<Vehicle> vehiclesOnDisplay;
   private int maximumCapacity;
//methods
    @Override
    public boolean assignVehicleToSLot(Vehicle vehicle,ShowroomSlot showroomSlot);
    @Override
    public ArrayList<ShowroomSlot> getFreeSlots();
}
