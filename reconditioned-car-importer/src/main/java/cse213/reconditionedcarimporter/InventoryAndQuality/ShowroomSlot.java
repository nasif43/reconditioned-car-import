package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.io.Serializable;

public class ShowroomSlot implements Serializable {
private int slotId,displayPriority,row,column;
private String slotLabel;
private boolean isOccupied;
private Vehicle assignedVehicle;

    public ShowroomSlot(int slotId, int displayPriority, int row, int column, String slotLabel, boolean isOccupied, Vehicle assignedVehicle) {
        this.slotId = slotId;
        this.displayPriority = displayPriority;
        this.row = row;
        this.column = column;
        this.slotLabel = slotLabel;
        this.isOccupied = isOccupied;
        this.assignedVehicle = assignedVehicle;
    }

    public ShowroomSlot() {
    }

    public boolean assignVehicle(){};
public void clearSlot(){};
public boolean isReserved(){};

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getDisplayPriority() {
        return displayPriority;
    }

    public void setDisplayPriority(int displayPriority) {
        this.displayPriority = displayPriority;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getSlotLabel() {
        return slotLabel;
    }

    public void setSlotLabel(String slotLabel) {
        this.slotLabel = slotLabel;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getAssignedVehicle() {
        return assignedVehicle;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle) {
        this.assignedVehicle = assignedVehicle;
    }

}
