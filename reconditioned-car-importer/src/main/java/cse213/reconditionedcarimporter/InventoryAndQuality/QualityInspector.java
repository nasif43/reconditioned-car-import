package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.AccouintantandTechnician.PartRequests;
import cse213.reconditionedcarimporter.AuctionAndSales.User;

import java.util.ArrayList;

public class QualityInspector extends User {
    private ArrayList<RepairPlan> activeRepairPlans;
    private int inspectionsCompleted;

    public QualityInspector(String userId, String name, String password, String email, String phone, String userRole, ArrayList<RepairPlan> activeRepairPlans, int inspectionsCompleted) {
        super(userId, name, password, email, phone, userRole);
        this.activeRepairPlans = activeRepairPlans;
        this.inspectionsCompleted = inspectionsCompleted;
    }

    public QualityInspector() {
    }

    //methods
    public InspectionReport performInitialInspection(){return null;};
    public boolean verifyPaintMatch(){return false;};
    public RepairPlan createRepairPlan(){return null;};
    public boolean approveRepairedVehicle(){return false;};
    public boolean documentHiddenDamage(){return false;};
    public PartRequests requestAdditionalParts(){return null;};
    public PaintMatchReport generatePaintMatchReport(){return null;};
    public Report generateMonthlyReport(){return null;};

    public ArrayList<RepairPlan> getActiveRepairPlans() {
        return activeRepairPlans;
    }

    public void setActiveRepairPlans(ArrayList<RepairPlan> activeRepairPlans) {
        this.activeRepairPlans = activeRepairPlans;
    }

    public int getInspectionsCompleted() {
        return inspectionsCompleted;
    }

    public void setInspectionsCompleted(int inspectionsCompleted) {
        this.inspectionsCompleted = inspectionsCompleted;
    }

}
