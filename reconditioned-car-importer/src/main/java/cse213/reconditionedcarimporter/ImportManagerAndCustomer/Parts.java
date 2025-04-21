package cse213.reconditionedcarimporter.ImportManagerAndCustomer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Parts {
    private String partId, name, type;
    private ArrayList<String> compatibleModels;
    private Float cost;
    private int quantity,reorderLevel;

    public Parts(String partId, String name, String type, ArrayList<String> compatibleModels, Float cost, int quantity, int reorderLevel, String supplier) {
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
        this.compatibleModels = (ArrayList<String>) compatibleModels;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    private String supplier;


    public void updateStatus(String status) {

    }

    private Float calculateProfit() {
        return null;
    }

    public Vehicle getFullDetails() {
        return null;
    }



}
