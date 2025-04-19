package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.ImportManagerAndCustomer.Vehicle;

import java.util.ArrayList;

public abstract class Location {
    protected int locationId,capacity, currentCount ;
    protected String name,address;

    public abstract boolean isFull();
    public abstract float calculateutilization();

}
