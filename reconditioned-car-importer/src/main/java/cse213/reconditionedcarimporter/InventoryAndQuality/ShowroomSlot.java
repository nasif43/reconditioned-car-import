package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.io.Serializable;

public class ShowroomSlot extends Serializable {
private int slotId,displayPriority,row,column;
private String slotLabel;
private boolean isOccupied;
private Vehicle assignedVehicle;

public boolean assignVehicle(){};
public void clearSlot(){};
public boolean isReserved(){};

}
