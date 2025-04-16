package cse213.reconditionedcarimporter.InventoryAndQuality;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepairPlan {
    private String planId,status;
    private ArrayList<RepairTask> tasks;
    private LocalDate deadline;
    private Vehicle vehicle;
    //methids
    public void createPlan(){};
    public void updateTask(){};
}
