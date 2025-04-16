package cse213.reconditionedcarimporter.InventoryAndQuality;

import cse213.reconditionedcarimporter.User;

import java.util.ArrayList;

public class QualityInspector extends User {
    private ArrayList<RepairPlan> activeRepairPlans;
    private int inspectionsCompleted;
    //methods
    public InspectionReport performInitialInspection(){return null;};
    public boolean verifyPaintMatch(){return null;};
    public RepairPlan createRepairPlan(){return null;};
    public boolean approveRepairedVehicle(){return null;};
    public boolean documentHiddenDamage(){return null;};
    public PartRequest requestAdditionalParts(){return null;};
    public PaintMatchReport generatePaintMatchReport(){return null;};
    public Report generateMonthlyReport(){return null;};

}
