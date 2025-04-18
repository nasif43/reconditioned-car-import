package cse213.reconditionedcarimporter.InventoryAndQuality;

public abstract class Location {
    protected int locationId,capacity, currentCount ;
    protected String name,address;

    public abstract boolean isFull();
    public abstract float calculateutilization();
}
