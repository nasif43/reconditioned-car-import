package cse213.reconditionedcarimporter.InventoryAndQuality;

public class Warehouse extends Location{
private WarehouseType type ;
private ArrayLIst<Vehicle>  vehicles;
   //methods
    public boolean isFull(){return false;};
    public float calculateUtilization(){return 0;} ;
}
