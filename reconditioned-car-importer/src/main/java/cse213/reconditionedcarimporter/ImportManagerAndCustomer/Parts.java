package cse213.reconditionedcarimporter.ImportManagerAndCustomer;

import java.util.List;
import java.util.function.Supplier;

public class Parts {
    private String partId, name, type; String
    private List<String> compatibleModels;
    private double cost; double
    private int quantity,reorderLevel;

    public Parts(String partId, String name, String type, List<String> compatibleModels, double cost, int quantity, int reorderLevel, Supplier supplier) {
        this.partId = partId;
        this.name = name;
        this.type = type;
        this.compatibleModels = compatibleModels;
        this.cost = cost;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
        this.supplier = supplier;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCompatibleModels() {
        return compatibleModels;
    }

    public void setCompatibleModels(List<String> compatibleModels) {
        this.compatibleModels = compatibleModels;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    private Supplier supplier;


    public void updateStatus(VehicleStatus status) {

    }

    private double calculateProfit() {
        return ;
    }

    public VehicleDetails getFullDetails() {
        return null;
    }



}
